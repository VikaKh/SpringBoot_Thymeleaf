package com.brunoyam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.brunoyam.demo")
public class DemoApplication{


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception
//	{
//		Product product1 = new Product("pr1");
//		Product product2 = new Product("pr2");
//		Product p = productRepository.save(product1);
//		Product p2 = productRepository.save(product2);
//		Customer student = new Customer("Ivan", Arrays.asList(p, p2));
//		customerRepository.save(student);
//		customerRepository.save(new Customer("Ira", "Ivanova", "ta@gmail.com"));
//	}

}
