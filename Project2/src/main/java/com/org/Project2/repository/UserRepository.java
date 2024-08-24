package com.org.Project2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.Project2.model.User;

public interface UserRepository extends MongoRepository <User, Integer> {}
