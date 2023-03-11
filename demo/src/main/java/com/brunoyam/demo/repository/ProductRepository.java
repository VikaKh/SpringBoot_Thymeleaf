package com.brunoyam.demo.repository;

import com.brunoyam.demo.entity.Customer;
import com.brunoyam.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}