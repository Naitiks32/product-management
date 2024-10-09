package com.delight.products_management.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delight.products_management.entity.Product;

public interface ProductReposiitory extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);

}
