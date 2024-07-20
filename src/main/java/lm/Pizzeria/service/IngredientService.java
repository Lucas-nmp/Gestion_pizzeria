package lm.Pizzeria.service;

import lm.Pizzeria.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas
 */
@Service
public class IngredientService {
    
    @Autowired
    IngredientRepository ingredientRepository;
    
}
