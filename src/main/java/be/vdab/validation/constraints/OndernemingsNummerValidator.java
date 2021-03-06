package be.vdab.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class OndernemingsNummerValidator implements ConstraintValidator<OndernemingsNummer,Long> {
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) return true;
        var laatste2Cijfers = value % 100;
        var overigeCijfers = value / 100;
        return laatste2Cijfers == 97 - overigeCijfers % 97;
    }

    @Override
    public void initialize(OndernemingsNummer constraintAnnotation) {

    }
}
