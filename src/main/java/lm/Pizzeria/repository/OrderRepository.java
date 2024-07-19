package lm.Pizzeria.repository;

import lm.Pizzeria.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
