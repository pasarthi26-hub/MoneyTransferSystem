/**
 * 
 */
package parth.money.transfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parth.money.transfer.dto.CustomerAccountDetailsDTO;
import parth.money.transfer.service.UserService;

/**
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getDetails/{customerId}")
	public CustomerAccountDetailsDTO getCusotmerDetails(@PathVariable("customerId") String customerId) {

		return userService.getCustomerData(customerId);
	}

	@GetMapping("/getAll")
	public List<CustomerAccountDetailsDTO> getAllCustomerAccountDetails() {

		return userService.getAllCustomerAccountDetails();
	}

}
