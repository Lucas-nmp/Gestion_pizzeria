package lm.Pizzeria.repository;

import lm.Pizzeria.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long>{
    
}
