/**
 * 
 */
package parth.money.transfer.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity Class For Customer
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3452899925254037079L;

	@Id
	@Column(name = "CUSTOMER_ID")
	private String customerId;

	@Column(name = "CUSTOMER_FIRST_NAME")
	private String customerFirstName;

	@Column(name = "CUSTOMER_LAST_NAME")
	private String customerLastName;

	@Column(name = "CUSTOMER_EMAIL")
	private String customerEmail;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CUST_JOINING_DATE")
	private Date customerjoiningDate;

	public Customer() {

	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the customerFirstName
	 */
	public String getCustomerFirstName() {
		return customerFirstName;
	}

	/**
	 * @param customerFirstName the customerFirstName to set
	 */
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	/**
	 * @return the customerLastName
	 */
	public String getCustomerLastName() {
		return customerLastName;
	}

	/**
	 * @param customerLastName the customerLastName to set
	 */
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	/**
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * @param customerEmail the customerEmail to set
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	/**
	 * @return the customerjoiningDate
	 */
	public Date getCustomerjoiningDate() {
		return customerjoiningDate;
	}

	/**
	 * @param customerjoiningDate the customerjoiningDate to set
	 */
	public void setCustomerjoiningDate(Date customerjoiningDate) {
		this.customerjoiningDate = customerjoiningDate;
	}

}
