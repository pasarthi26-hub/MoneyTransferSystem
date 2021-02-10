/**
 * 
 */
package parth.money.transfer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import parth.money.transfer.exception.AccountNotValidException;
import parth.money.transfer.exception.ValidationException;
import parth.money.transfer.exception.response.GenericErrorResponse;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ValidationException.class)
	public GenericErrorResponse handleValidationException(ValidationException e) {
		
		return buildErrorResponse(e);
		
	}
	@ExceptionHandler(AccountNotValidException.class)
	public GenericErrorResponse handleAccountValidException(AccountNotValidException e) {
		
		return buildErrorResponse(e);
		
	}
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public GenericErrorResponse handleException(AccountNotValidException e) {
		
		return buildErrorResponse(e);
		
	}

	/**
	 * @param e
	 * @return
	 */
	private GenericErrorResponse buildErrorResponse(Exception e) {
		GenericErrorResponse errorResponse = new GenericErrorResponse();
		
		errorResponse.setErrorKey("Validation Exception");
		errorResponse.setErrorMessage(e.getMessage());
		errorResponse.setStackTrace(getStackTrace(e));
		return errorResponse;
	}
	/**
	 * @param e
	 * @return
	 */
	private String getStackTrace(Exception e) {
		String stack = "";
		for(StackTraceElement element : e.getStackTrace()) {
			stack = stack +element;
		}
		return stack;
	}
	

}
