package com.ankamma.product;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

import com.ankamma.product.feign.ProductClient;
import com.ankamma.product.model.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureJson
@AutoConfigureStubRunner(ids = "com.ankamma.product:product-domain-service:+:9090", stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class ProductApiClientTest {
	@Autowired
	private ProductClient productClient;

	@Test
	public void createProductToContract() {
		Product product = new Product(1L, "ankamma");
		Product productresponse = productClient.createProduct(product);
		Assertions.assertThat(productresponse.getProductName()).isEqualToIgnoringCase("ankamma");
	}

}
