/**
 * 
 */
package parth.money.transfer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import parth.money.transfer.common.TransactionType;
import parth.money.transfer.contract.IProcessor;
import parth.money.transfer.dto.TransactionInputDTO;
import parth.money.transfer.dto.TransactionOutputDTO;
import parth.money.transfer.factory.ProcessorFactory;
import parth.money.transfer.service.TransactionService;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private ProcessorFactory factory;
	
	//TODO
	/**
	 * We can have Pipeline pattern here.. Like how it is for Streams API.. Validate.next(Process).next(ResponseGenerator)
	 * 
	 */

	/**
	 * This will call the Processor Validate and PRocess method.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public TransactionOutputDTO transfer(TransactionInputDTO inputDTO, TransactionType type) {

		IProcessor<TransactionInputDTO, TransactionOutputDTO> processor = factory.getProcessor(type);
		if(processor.validate(inputDTO))
			return processor.process(inputDTO);
		
		return new TransactionOutputDTO();
		
	}

}
