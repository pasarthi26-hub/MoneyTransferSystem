/**
 * 
 */
package parth.money.transfer.processor;

import org.springframework.beans.factory.annotation.Autowired;

import parth.money.transfer.common.TransactionType;
import parth.money.transfer.contract.IProcessor;
import parth.money.transfer.definition.Processor;
import parth.money.transfer.domain.Account;
import parth.money.transfer.dto.TransactionInputDTO;
import parth.money.transfer.dto.TransactionOutputDTO;
import parth.money.transfer.exception.ValidationException;
import parth.money.transfer.repository.AccountRepository;
import parth.money.transfer.validators.AccountValidator;
import parth.money.transfer.validators.TransactionLimitValidator;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Processor(transactionType = TransactionType.IMPS)
public class IMPSTransactionProcessor implements IProcessor<TransactionInputDTO, TransactionOutputDTO> {

	@Autowired
	private TransactionLimitValidator limitValidator;

	@Autowired
	private AccountValidator accountValidator;

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public TransactionOutputDTO process(TransactionInputDTO input) {

		return executeTransferRequest(input);
	}

	/**
	 * performs the transfer request
	 * 
	 * @param input
	 */
	// TODO
	/*
	 * 1. This Scenario is if Account exists with the system only, there can be
	 * possibility we would need to call different System API.. We need to have
	 * scenario if other bank is taking time W can implement Circuit bracker, this
	 * will help to identify if any specific bank or UPI is taking time to process.
	 * 
	 * 2. For Multiple requests , we can have OPTIMISTIC_LOCK with Hibernate Version
	 *
	 *
	 */
	private TransactionOutputDTO executeTransferRequest(TransactionInputDTO input) {

		Account recipientAccount = accountRepository.findById(input.getRecepientAccountNumber()).get();
		Account requestorAccount = accountRepository.findById(input.getTransferAccountNumber()).get();

		if (requestorAccount.getBalance() >= input.getAmountTransfer()) {

			TransactionOutputDTO outputDto = new TransactionOutputDTO();

			requestorAccount.setBalance(requestorAccount.getBalance() - input.getAmountTransfer());
			recipientAccount.setBalance(recipientAccount.getBalance() + input.getAmountTransfer());

			outputDto.setAmount(input.getAmountTransfer());
			outputDto.setRecepientName(recipientAccount.getCustomer().getCustomerFirstName());
			outputDto.setStatus("SUCCESS");

			return outputDto;

		} else {
			throw new ValidationException("Transfer Amount is greater than Minumun amount, Please check");
		}

	}

	/**
	 * Validate the Input request DTO
	 */
	@Override
	public boolean validate(TransactionInputDTO input) {
		return accountValidator.Validate(input.getRecepientAccountNumber()) && limitValidator.Validate(input);

	}

}
