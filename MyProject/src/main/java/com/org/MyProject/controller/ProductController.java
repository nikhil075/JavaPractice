package com.org.MyProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.org.MyProject.model.Product;
import com.org.MyProject.repository.ProductRepository;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
@Autowired  
ProductRepository repo;
@PostMapping(path="/add")
public ResponseEntity<Response> addProduct(@RequestParam String name, @RequestParam String brandname, @RequestParam Integer price) {
	Product product= new Product(null, name, brandname, price);
	System.out.println("Product: "+ product);
	
	try {
		repo.save(product);
		Response response = new Response(101, "Product "+ name+"Saved Successfully");
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	} catch (Exception e) {
		// TODO: handle exception
		Response response = new Response(701, "Product "+ name+"Not Saved Successfully. Exception: "+e.getMessage());
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	
}
} 


