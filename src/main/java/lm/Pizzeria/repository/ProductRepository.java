package lm.Pizzeria.repository;

import lm.Pizzeria.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
