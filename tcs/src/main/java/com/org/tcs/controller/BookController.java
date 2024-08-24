package com.org.tcs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.org.tcs.model.Books;
import com.org.tcs.repository.BookRepo;

import java.util.List;

// Annotation 
@RestController

// Class 
public class BookController {

	@Autowired
	private BookRepo repo;

	@PostMapping("/addBook")
	public String saveBook(@RequestBody Books book){
		repo.save(book);
	
		return "Added Successfully";
	}

	@GetMapping("/findAllBooks")
	public List<Books> getBooks() {
	
		return repo.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id){
		repo.deleteById(id);
	
		return "Deleted Successfully";
	}

}
