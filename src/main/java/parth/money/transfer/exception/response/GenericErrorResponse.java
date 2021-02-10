/**
 * 
 */
package parth.money.transfer.exception.response;

import java.io.Serializable;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public class GenericErrorResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2659131272910694100L;
	private String errorKey;
	private String errorMessage;
	private String stackTrace;

	/**
	 * @return the errorKey
	 */
	public String getErrorKey() {
		return errorKey;
	}

	/**
	 * @param errorKey the errorKey to set
	 */
	public void setErrorKey(String errorKey) {
		this.errorKey = errorKey;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the stackTrace
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * @param stackTrace the stackTrace to set
	 */
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

}
