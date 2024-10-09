package com.delight.products_management.services;

import java.util.List;

import com.delight.products_management.dto.RestockPlanDTO;
import com.delight.products_management.entity.Product;

public interface ProductService {

	public Product create(Product product);
	public List<Product> getAll();
	public Product getById(int id) throws Exception;
	public void delete(int id);
	public List<Product> getByName(String name) throws Exception;
	public List<RestockPlanDTO> calculateRestockPlan();
}
