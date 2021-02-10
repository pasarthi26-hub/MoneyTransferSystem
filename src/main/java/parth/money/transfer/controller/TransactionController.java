/**
 * 
 */
package parth.money.transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import parth.money.transfer.common.TransactionType;
import parth.money.transfer.dto.TransactionInputDTO;
import parth.money.transfer.dto.TransactionOutputDTO;
import parth.money.transfer.service.TransactionService;

/**
 * This is controller class for Transactions
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@PostMapping("/transfer/{type}")
	public TransactionOutputDTO getData(
			@ApiParam(allowableValues = "UPI, RTGS, NEFT, IMPS", required = true) @PathVariable("type") TransactionType type,
			@RequestBody TransactionInputDTO inputDTO) {

		return transactionService.transfer(inputDTO, type);

	}

}
