package com.org.tcs.repository;


// Java Program to Illustrate BookRepo File

import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.tcs.model.Books;

public interface BookRepo
	extends MongoRepository<Books, Integer> {
}
