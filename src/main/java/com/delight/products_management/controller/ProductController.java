package com.delight.products_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delight.products_management.dto.RestockPlanDTO;
import com.delight.products_management.entity.Product;
import com.delight.products_management.services.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public Product create(@RequestBody Product product) {
		return service.create(product);
	}

	@GetMapping
	private List<Product> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Product getById(@PathVariable int id) throws Exception {
		return service.getById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		service.delete(id);
	}

	@GetMapping("/restockPlan")
	public List<RestockPlanDTO> calculateRestockPlan() {
		
		System.out.println("Called Product -> feign client -> restock plan");
		return service.calculateRestockPlan();
	}
}
