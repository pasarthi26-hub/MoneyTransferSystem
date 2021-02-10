/**
 * 
 */
package parth.money.transfer.contract;

/**
 * Contract for Processor 
 * @author :  Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
public interface IProcessor<I, O> {
	
	boolean validate(I input);
	
	O process(I input);
}
