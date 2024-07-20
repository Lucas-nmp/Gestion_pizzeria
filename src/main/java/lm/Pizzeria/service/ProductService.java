package lm.Pizzeria.service;

import java.util.List;
import lm.Pizzeria.model.Product;
import lm.Pizzeria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas
 */
@Service
public class ProductService {
    
    @Autowired 
    ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public void addModifyProduct(Product product) {
        productRepository.save(product);
    }
    
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }
    
}
