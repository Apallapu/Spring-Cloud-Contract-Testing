package com.ankamma.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankamma.product.model.Product;
import com.ankamma.product.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@PostMapping("/create-product")
	public Product createProduct(@RequestBody Product request) {
		return productRepository.save(request);

	}

}
