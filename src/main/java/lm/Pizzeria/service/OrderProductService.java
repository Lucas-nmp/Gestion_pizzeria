package lm.Pizzeria.service;

import lm.Pizzeria.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lucas
 */
public class OrderProductService {
    
    @Autowired 
    OrderProductRepository orderProductRepository;
    
    
}
