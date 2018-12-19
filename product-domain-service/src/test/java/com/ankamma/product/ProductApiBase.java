package com.ankamma.product;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ankamma.product.controller.ProductController;
import com.ankamma.product.model.Product;
import com.ankamma.product.repository.ProductRepository;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductApiBase {
	@MockBean
	private ProductRepository productRepository;

	@Autowired
	private ProductController controller;

	@Before
	public void before() throws Exception {
		Mockito.when(this.productRepository.save(Mockito.any()))
				.thenReturn(new Product(1L, "ankamma"));
		RestAssuredMockMvc.standaloneSetup(this.controller);
	}

}
