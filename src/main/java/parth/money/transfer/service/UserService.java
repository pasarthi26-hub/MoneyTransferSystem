/**
 * 
 */
package parth.money.transfer.service;

import java.util.List;

import parth.money.transfer.dto.CustomerAccountDetailsDTO;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public interface UserService {

	CustomerAccountDetailsDTO getCustomerData(String customerId);
	
	List<CustomerAccountDetailsDTO> getAllCustomerAccountDetails();

}
