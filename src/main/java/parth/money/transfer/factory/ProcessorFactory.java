/**
 * 
 */
package parth.money.transfer.factory;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import parth.money.transfer.common.TransactionType;
import parth.money.transfer.contract.IProcessor;
import parth.money.transfer.definition.Processor;

/**
 * Factory Class for Processors on basis of Transaction Type
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Component
public class ProcessorFactory {

	@Autowired
	private ApplicationContext appContext;

	private Map<TransactionType, String> transactionProcessorMap = new HashMap<>();

	@PostConstruct
	public void populateTransactionMap() {

		Map<String, Object> processorMap = appContext.getBeansWithAnnotation(Processor.class);

		processorMap.keySet().stream().forEach(eachProcessorKey -> {
			Processor processor = appContext.findAnnotationOnBean(eachProcessorKey, Processor.class);

			transactionProcessorMap.put(processor.transactionType(), eachProcessorKey);
		});

	}

	/**
	 * Return Processor on basis of TransactionType
	 * 
	 * @param type
	 * @return
	 */

	@SuppressWarnings({ "rawtypes" })
	public IProcessor getProcessor(TransactionType type) {

		return (IProcessor) appContext.getBean(transactionProcessorMap.get(type));
	}

}
