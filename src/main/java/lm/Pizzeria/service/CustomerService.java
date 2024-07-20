package lm.Pizzeria.service;

import lm.Pizzeria.model.Customer;
import lm.Pizzeria.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas
 */
@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;
    
    public int countAllCustomer() {
        return customerRepository.findAll().size();
    }
    
    public Customer findCustomerByPhone(String phone) {
        Customer customer = customerRepository.findCustomerByPhone(phone);
        return customer;
    }
    
    public void addModifiCustomer(Customer customer) {
        customerRepository.save(customer);
    }
    
    
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }
    
    
    
    
}
