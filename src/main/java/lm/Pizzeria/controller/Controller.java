package lm.Pizzeria.controller;

import java.util.List;
import lm.Pizzeria.model.Customer;
import lm.Pizzeria.model.Product;
import lm.Pizzeria.service.CustomerService;
import lm.Pizzeria.service.IngredientService;
import lm.Pizzeria.service.OrderProductService;
import lm.Pizzeria.service.OrderService;
import lm.Pizzeria.service.ProductIngredientService;
import lm.Pizzeria.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas
 */
@RestController
@RequestMapping("pizzeria")
@CrossOrigin(value = "http://localhost:3000")
public class Controller {
    
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    
    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private IngredientService ingredientService;
    
    @Autowired
    private OrderProductService orderProductService;
    
    @Autowired
    private OrderService orderService;
    
    @Autowired 
    private ProductIngredientService productIngredientService;
    
    @Autowired 
    private ProductService productService;
    
    
    @GetMapping("/products")
    public List<Product> viewProducts() {
        // buscar productos por categoria en lugar de todos
        var products = productService.getAllProducts();
        products.forEach((product -> logger.info(product.toString())));
        return products;
    }
    
    @GetMapping("/customer/{phone}")
    public ResponseEntity<Customer> getCustomerByPhone(@PathVariable String phone) {
        Customer customer = customerService.findCustomerByPhone(phone);
        return ResponseEntity.ok(customer);
    }
    
    
}
