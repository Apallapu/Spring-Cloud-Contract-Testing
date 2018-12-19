package com.ankamma.product.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ankamma.product.model.Product;

@FeignClient(value = "PRODUCTDOMAINSERVICE", url = "http://laptop-20tk568d:9090/")
@RibbonClient(name = "PRODUCTDOMAINSERVICE")
public interface ProductClient {
	@PostMapping("/product/create-product")
	public Product createProduct(@RequestBody Product request);

}
