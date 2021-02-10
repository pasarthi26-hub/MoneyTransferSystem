/**
 * 
 */
package parth.money.transfer.service;

import parth.money.transfer.common.TransactionType;
import parth.money.transfer.dto.TransactionInputDTO;
import parth.money.transfer.dto.TransactionOutputDTO;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public interface TransactionService {
	
	TransactionOutputDTO transfer(TransactionInputDTO inputDTO, TransactionType transactionType);
}
