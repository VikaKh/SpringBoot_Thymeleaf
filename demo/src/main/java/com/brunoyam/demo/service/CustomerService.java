package com.brunoyam.demo.service;

import com.brunoyam.demo.entity.Customer;
import com.brunoyam.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAll(){
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            throw new Exception();
        }
    }

    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Delete customer based on the customer ID.
     * @param customerId
     * @return boolean flag showing the request status
     */
    public boolean delete(Long customerId) {
        customerRepository.deleteById(customerId);
        return true;
    }

}
