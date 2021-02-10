/**
 * 
 */
package parth.money.transfer.validators;

import parth.money.transfer.contract.IValidator;
import parth.money.transfer.definition.Validator;
import parth.money.transfer.dto.TransactionInputDTO;
import parth.money.transfer.exception.ValidationException;

/**
 * Limit Validator
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Validator
public class TransactionLimitValidator implements IValidator<TransactionInputDTO> {

	/**
	 * This will serve as validator method to check if the Transation amount is more
	 * than Transaction Limit
	 * 
	 */
	@Override
	public boolean Validate(TransactionInputDTO input) {

		if (input.getAmountTransfer() > 40000) {

			throw new ValidationException("Transfer Amount is Above Transaction Limit");

		}

		return true;
	}

}
