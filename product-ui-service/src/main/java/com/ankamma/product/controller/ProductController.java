package com.ankamma.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankamma.product.feign.ProductClient;
import com.ankamma.product.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductClient productClient;

	@PostMapping("/create-product")
	public Product createProduct(@RequestBody Product request) {
		return productClient.createProduct(request);

	}

}
