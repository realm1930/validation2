package be.vdab.validation.constraints;

import be.vdab.validation.domain.Product;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class VerkoopPrijsAankoopPrijsValidator implements ConstraintValidator<VerkoopPrijsAankoopPrijs, Product> {
    @Override
    public boolean isValid(Product product, ConstraintValidatorContext context) {
        if (product == null) return true;
        if (product.getVerkoopPrijs()==null || product.getAankoopPrijs()==null) return false;
        return product.getVerkoopPrijs().compareTo(product.getAankoopPrijs())>=0;
    }

    @Override
    public void initialize(VerkoopPrijsAankoopPrijs constraintAnnotation) {

    }
}
