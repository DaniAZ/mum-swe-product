package mum.swe.democrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import mum.swe.democrud.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
