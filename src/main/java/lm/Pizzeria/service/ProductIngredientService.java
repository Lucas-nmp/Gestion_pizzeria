package lm.Pizzeria.service;

import lm.Pizzeria.repository.ProductIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lucas
 */
public class ProductIngredientService {
    
    @Autowired
    ProductIngredientRepository productIngredientRepository;
    
}
