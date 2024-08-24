package com.org.MyProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.org.MyProject.model.Product;

public interface ProductRepository extends CrudRepository<Product ,Integer> {

	
}
