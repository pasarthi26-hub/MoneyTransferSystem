/**
 * 
 */
package parth.money.transfer.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity Class For Transaction
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Entity
@Table(name = "TRANSACTION")
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2046458254757746351L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;

	@JoinColumn(name = "TRANSFER_ACCOUNT", referencedColumnName = "ACCOUNT_NUMBER")
	private Account transferAccount;

	@JoinColumn(name = "RECEPIENT_ACCOUNT", referencedColumnName = "ACCOUNT_NUMBER")
	private Account recepientAccount;

	@Column(name = "TRANSACTION_AMOUNT")
	private Double transactionAmount;

	@Column(name = "STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TRANSACTION_DATE")
	private Date transactionDate;

	public Transaction() {

	}

	/**
	 * @return the transactionId
	 */
	public Long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the transferAccount
	 */
	public Account getTransferAccount() {
		return transferAccount;
	}

	/**
	 * @param transferAccount the transferAccount to set
	 */
	public void setTransferAccount(Account transferAccount) {
		this.transferAccount = transferAccount;
	}

	/**
	 * @return the recepientAccount
	 */
	public Account getRecepientAccount() {
		return recepientAccount;
	}

	/**
	 * @param recepientAccount the recepientAccount to set
	 */
	public void setRecepientAccount(Account recepientAccount) {
		this.recepientAccount = recepientAccount;
	}

	/**
	 * @return the transactionAmount
	 */
	public Double getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
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

	/**
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}
