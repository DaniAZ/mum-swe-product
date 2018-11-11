package mum.swe.democrud.service;

import java.util.List;

import mum.swe.democrud.model.Product;

public interface ProductService {
	 List<Product> findAll();
	 Product save(Product product);
	 Product findOne(Long id);
	 void delete(Long id);
}
