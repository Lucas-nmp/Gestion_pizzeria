package lm.Pizzeria.service;

import lm.Pizzeria.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas
 */
@Service
public class OrderProductService {
    
    @Autowired 
    OrderProductRepository orderProductRepository;
    
    
}
