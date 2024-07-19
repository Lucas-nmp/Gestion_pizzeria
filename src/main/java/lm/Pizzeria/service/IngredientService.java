package lm.Pizzeria.service;

import lm.Pizzeria.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lucas
 */
public class IngredientService {
    
    @Autowired
    IngredientRepository ingredientRepository;
    
}
