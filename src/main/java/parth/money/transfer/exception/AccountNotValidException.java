/**
 * 
 */
package parth.money.transfer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author :  Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Account Number is not valid")
public class AccountNotValidException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3610057426943253675L;
	
	public AccountNotValidException() {
		super();
	}
	
	public AccountNotValidException(String message) {
		super(message);
	}
	
	
}
