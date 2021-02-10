/**
 * 
 */
package parth.money.transfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import parth.money.transfer.domain.Transaction;

/**
 * Repository Class for Transaction Entity
 * 
 * @author : Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
