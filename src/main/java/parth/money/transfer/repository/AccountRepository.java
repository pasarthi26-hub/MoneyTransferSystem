/**
 * 
 */
package parth.money.transfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import parth.money.transfer.domain.Account;

/**
 * Repository Class for Account Entity
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

	/**
	 * @param customerId
	 * @return
	 */
	Account findByCustomer(String customerId);

}
