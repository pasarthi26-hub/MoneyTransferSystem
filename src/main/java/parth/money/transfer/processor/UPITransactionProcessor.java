/**
 * 
 */
package parth.money.transfer.processor;

import parth.money.transfer.common.TransactionType;
import parth.money.transfer.contract.IProcessor;
import parth.money.transfer.definition.Processor;
import parth.money.transfer.dto.TransactionInputDTO;
import parth.money.transfer.dto.TransactionOutputDTO;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Processor(transactionType = TransactionType.UPI)
public class UPITransactionProcessor implements IProcessor<TransactionInputDTO, TransactionOutputDTO> {

	@Override
	public TransactionOutputDTO process(TransactionInputDTO input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validate(TransactionInputDTO input) {
		// TODO Auto-generated method stub
		return false;
	}

}
