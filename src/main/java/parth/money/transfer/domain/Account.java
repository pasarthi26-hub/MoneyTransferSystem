/**
 * 
 */
package parth.money.transfer.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import parth.money.transfer.common.AccountType;

/**
 * Entity Class For Account
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2608590263232772915L;

	@Id
	@Column(name = "ACCOUNT_NUMBER")
	private String accoundtNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "ACCOUNT_TYPE")
	private AccountType accountType;
	
	@OneToOne
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
	private Customer customer;

	@Column(name = "BALANCE")
	private Double balance;
	
	@Column(name ="UPI_ID")
	private String upiId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OPENING_DATE")
	private Date accountOpeningDate;

	public Account() {

	}

	/**
	 * @return the accoundtNumber
	 */
	public String getAccoundtNumber() {
		return accoundtNumber;
	}

	/**
	 * @param accoundtNumber the accoundtNumber to set
	 */
	public void setAccoundtNumber(String accoundtNumber) {
		this.accoundtNumber = accoundtNumber;
	}

	/**
	 * @return the accountType
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accountOpeningDate
	 */
	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}

	/**
	 * @param accountOpeningDate the accountOpeningDate to set
	 */
	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	/**
	 * @return the upiId
	 */
	public String getUpiId() {
		return upiId;
	}

	/**
	 * @param upiId the upiId to set
	 */
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	

}
