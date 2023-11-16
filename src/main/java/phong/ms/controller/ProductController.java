package phong.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phong.ms.entity.ProductEntity;
import phong.ms.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping(value = "/getAll")
	public List<ProductEntity> getAllProduct() {
		System.out.print(service.getAllProduct());
		return service.getAllProduct();
	}

}
