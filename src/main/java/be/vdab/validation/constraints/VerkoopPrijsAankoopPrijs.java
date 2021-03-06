package be.vdab.validation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

;
@Target({TYPE,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = VerkoopPrijsAankoopPrijsValidator.class)
public @interface VerkoopPrijsAankoopPrijs {
    String message() default "{be.vdab.VerkoopPrijsAankoopPrijs.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
