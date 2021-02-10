/**
 * 
 */
package parth.money.transfer.dto;

import java.io.Serializable;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public class TransactionInputDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1529021279409420334L;

//	private TransactionType transactionType;
	private String transferAccountNumber;
	private String recepientAccountNumber;
	private String recepientUPIId;
	private Double amountTransfer;

	/**
	 * @return the transactionType
	 */
	/*
	 * public TransactionType getTransactionType() { return transactionType; }
	 * 
	 *//**
		 * @param transactionType the transactionType to set
		 *//*
			 * public void setTransactionType(TransactionType transactionType) {
			 * this.transactionType = transactionType; }
			 */

	/**
	 * @return the transferAccountNumber
	 */
	public String getTransferAccountNumber() {
		return transferAccountNumber;
	}

	/**
	 * @param transferAccountNumber the transferAccountNumber to set
	 */
	public void setTransferAccountNumber(String transferAccountNumber) {
		this.transferAccountNumber = transferAccountNumber;
	}

	/**
	 * @return the recepientAccountNumber
	 */
	public String getRecepientAccountNumber() {
		return recepientAccountNumber;
	}

	/**
	 * @param recepientAccountNumber the recepientAccountNumber to set
	 */
	public void setRecepientAccountNumber(String recepientAccountNumber) {
		this.recepientAccountNumber = recepientAccountNumber;
	}

	/**
	 * @return the recepientUPIId
	 */
	public String getRecepientUPIId() {
		return recepientUPIId;
	}

	/**
	 * @param recepientUPIId the recepientUPIId to set
	 */
	public void setRecepientUPIId(String recepientUPIId) {
		this.recepientUPIId = recepientUPIId;
	}

	/**
	 * @return the amounttransfer
	 */
	public Double getAmountTransfer() {
		return amountTransfer;
	}

	/**
	 * @param amounttransfer the amounttransfer to set
	 */
	public void setAmountTransfer(Double amountTransfer) {
		this.amountTransfer = amountTransfer;
	}

}
