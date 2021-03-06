package be.vdab.validation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = OndernemingsNummerValidator.class)
public @interface OndernemingsNummer {
    String message() default "{be.vdab.OndernemingsNummer.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
