/**
 * 
 */
package parth.money.transfer.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * Customer Annotation to tag a Response Generator 
 * @author :  Parth, Sarthi
 * @createdon : 10 Feb 2021
 */
@Component
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ResponseGenerator {

}
