package be.vdab.validation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Target({METHOD,FIELD,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy={})
@PositiveOrZero
@Digits(integer = 7,fraction = 2)
public @interface Prijs {
    String  message() default "{be.vdab.Prijs.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
