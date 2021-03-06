package be.vdab.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class PrijsValidator implements ConstraintValidator<Prijs, BigDecimal> {
    @Override
    public void initialize(Prijs constraintAnnotation) {
    }

    @Override
    public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
        if (value == null) return true;
        if (value.compareTo(BigDecimal.ZERO)<0) return false;
        var aantalCijfersNaKomma = value.scale();
        if (aantalCijfersNaKomma > 2) return false;
        var totaalAantalCijfers = value.precision();
        return totaalAantalCijfers - aantalCijfersNaKomma <= 7;
    }
}
