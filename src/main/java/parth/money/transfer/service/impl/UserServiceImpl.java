/**
 * 
 */
package parth.money.transfer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parth.money.transfer.domain.Account;
import parth.money.transfer.domain.Customer;
import parth.money.transfer.dto.CustomerAccountDetailsDTO;
import parth.money.transfer.repository.AccountRepository;
import parth.money.transfer.repository.CustomerRepository;
import parth.money.transfer.service.UserService;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AccountRepository accountRepository;

	/**
	 * This Method returns the Account details of the customer
	 */

	@Override
	public CustomerAccountDetailsDTO getCustomerData(String customerId) {
		CustomerAccountDetailsDTO accountDetailsDTO = new CustomerAccountDetailsDTO();

		Customer customer = customerRepository.findById(customerId).get();
		Account account = accountRepository.findByCustomer(customerId);

		accountDetailsDTO.setAccountType(account.getAccountType().name());
		accountDetailsDTO.setCustomerName(customer.getCustomerFirstName() + ", " + customer.getCustomerLastName());
		accountDetailsDTO.setBalance(account.getBalance());
		return accountDetailsDTO;
	}

	@Override
	public List<CustomerAccountDetailsDTO> getAllCustomerAccountDetails() {
		List<CustomerAccountDetailsDTO> accountDetailsDTOs = new ArrayList<CustomerAccountDetailsDTO>();
		List<Account> accounts = accountRepository.findAll();
		accounts.stream().forEach(eachAccount -> {

			CustomerAccountDetailsDTO accountDetailsDTO = new CustomerAccountDetailsDTO();
			accountDetailsDTO.setAccountType(eachAccount.getAccountType().name());
			accountDetailsDTO.setBalance(eachAccount.getBalance());
			accountDetailsDTO.setCustomerName(eachAccount.getCustomer().getCustomerFirstName() + ", "
					+ eachAccount.getCustomer().getCustomerLastName());

			accountDetailsDTOs.add(accountDetailsDTO);

		});

		return accountDetailsDTOs;
	}

}
