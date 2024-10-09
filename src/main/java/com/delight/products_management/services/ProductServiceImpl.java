package com.delight.products_management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delight.products_management.dto.RestockPlanDTO;
import com.delight.products_management.entity.Product;
import com.delight.products_management.repositories.ProductReposiitory;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductReposiitory reposiitory;
	
	@Autowired
	private OrderFeignSerivce orderFeignSerivce;

	@Override
	public Product create(Product product) {
		return reposiitory.save(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return reposiitory.findAll();
	}

	@Override
	public Product getById(int id) throws Exception {
		return reposiitory.findById(id).orElseThrow(() -> new Exception());
	}

	@Override
	public void delete(int id) {
		reposiitory.deleteById(id);
	}

	@Override
	public List<Product> getByName(String name) throws Exception {
		return reposiitory.findByName(name);
	}

	@Override
	public List<RestockPlanDTO> calculateRestockPlan() {
		
		System.out.println("called calc prod");
//		return null;
		return orderFeignSerivce.calculateRestockPlan();
	}

}
