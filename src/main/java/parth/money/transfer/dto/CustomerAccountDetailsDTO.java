/**
 * 
 */
package parth.money.transfer.dto;

import java.io.Serializable;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public class CustomerAccountDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1232685423924309620L;

	private String customerName;
	private String accountType;
	private Double balance;

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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

}
