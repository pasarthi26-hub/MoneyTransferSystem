/**
 * 
 */
package parth.money.transfer.contract;

/**
 * Contract for Validators
 * @author :  Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public interface IValidator<I> {

		boolean Validate(I input);
}
