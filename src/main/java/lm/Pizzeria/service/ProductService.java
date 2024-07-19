package lm.Pizzeria.service;

import lm.Pizzeria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lucas
 */
public class ProductService {
    
    @Autowired 
    ProductRepository productRepository;
    
}
