/**
 * 
 */
package parth.money.transfer.dto;

import java.io.Serializable;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public class TransactionOutputDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1357854086653946099L;

	private Double amount;
	private String recepientName;
	private String status;

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the recepientName
	 */
	public String getRecepientName() {
		return recepientName;
	}

	/**
	 * @param recepientName the recepientName to set
	 */
	public void setRecepientName(String recepientName) {
		this.recepientName = recepientName;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
