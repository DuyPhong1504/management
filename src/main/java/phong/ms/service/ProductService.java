package phong.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phong.ms.entity.ProductEntity;
import phong.ms.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	@Transactional
	public List<ProductEntity> getAllProduct() {
		List<ProductEntity> productList = repository.findAll();
		return productList;
	}

}
