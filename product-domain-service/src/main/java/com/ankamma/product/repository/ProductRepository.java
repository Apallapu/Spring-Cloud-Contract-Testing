package com.ankamma.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankamma.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
