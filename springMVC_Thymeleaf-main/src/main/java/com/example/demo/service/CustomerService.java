package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.NotFoundException;
import java.util.*;

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

    public Customer getCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            throw new CustomerNotFoundException();
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
    public boolean deleteById(Long customerId) {
        customerRepository.deleteById(customerId);
        return true;
    }
public List<Customer> sorted(){
        List<Customer> customers = getAll();
    Comparator<Customer> customerComparator
            = Comparator.comparing(Customer::getName);
    Collections.sort(customers, customerComparator);
    return customers;
}
}
