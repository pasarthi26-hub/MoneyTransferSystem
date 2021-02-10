/**
 * 
 */
package parth.money.transfer.validators;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import parth.money.transfer.contract.IValidator;
import parth.money.transfer.definition.Validator;
import parth.money.transfer.domain.Account;
import parth.money.transfer.exception.AccountNotValidException;
import parth.money.transfer.repository.AccountRepository;

/**
 * Vailidator Class For Account Validation
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Validator
public class AccountValidator implements IValidator<String> {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public boolean Validate(String accountNumber) {
		Optional<Account> account = accountRepository.findById(accountNumber);

		if (!account.isPresent()) {
			throw new AccountNotValidException("Account Number is Not Valid, Please check again.");
		}
		return true;
	}

}
