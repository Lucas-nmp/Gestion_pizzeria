package lm.Pizzeria.service;

import lm.Pizzeria.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas
 */
@Service
public class OrderService {
    
    @Autowired
    OrderRepository orderRepository;
}
