package lm.Pizzeria.repository;

import lm.Pizzeria.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
