package lm.Pizzeria.repository;

import lm.Pizzeria.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface IngredientRepository extends JpaRepository<Ingredient, Long>{
    
}
