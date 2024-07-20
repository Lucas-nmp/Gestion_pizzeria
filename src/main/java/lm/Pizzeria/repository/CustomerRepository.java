package lm.Pizzeria.repository;

import java.util.List;
import lm.Pizzeria.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Lucas
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    

    @Query("SELECT c FROM Customer c WHERE c.phone = :phone")
    Customer findCustomerByPhone (@Param("phone") String phone);
    
}
