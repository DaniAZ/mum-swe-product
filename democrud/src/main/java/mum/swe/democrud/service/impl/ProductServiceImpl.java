package mum.swe.democrud.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.swe.democrud.model.Product;
import mum.swe.democrud.repository.ProductRepository;
import mum.swe.democrud.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		productRepository.delete(id);
	}

}
