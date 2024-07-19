package lm.Pizzeria.repository;

import lm.Pizzeria.model.ProductIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface ProductIngredientRepository extends JpaRepository<ProductIngredient, Long>{
    
}
