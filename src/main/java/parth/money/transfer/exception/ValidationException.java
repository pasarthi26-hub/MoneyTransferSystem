/**
 * 
 */
package parth.money.transfer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class ValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3452544353798660870L;

	public ValidationException() {
		super();
	}

	public ValidationException(String message) {
		super(message);
	}

}
