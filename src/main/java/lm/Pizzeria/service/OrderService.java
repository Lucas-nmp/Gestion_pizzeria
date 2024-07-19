package lm.Pizzeria.service;

import lm.Pizzeria.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lucas
 */
public class OrderService {
    
    @Autowired
    OrderRepository orderRepository;
}
