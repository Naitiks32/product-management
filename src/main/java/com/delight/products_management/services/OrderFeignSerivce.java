package com.delight.products_management.services;
 
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.delight.products_management.dto.RestockPlanDTO;



@FeignClient(name="INVENTORY-MANAGEMENT")
public interface OrderFeignSerivce {

	@GetMapping("/order/calculate/restockPlan")
	public List<RestockPlanDTO> calculateRestockPlan(); 
}
