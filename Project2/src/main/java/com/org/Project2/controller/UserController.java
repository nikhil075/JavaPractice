package com.org.Project2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.Project2.model.User;
import com.org.Project2.repository.UserRepository;

@RestController
@RequestMapping
public class UserController {
@Autowired
UserRepository usr ;
@PostMapping("/addUser")
public String addUser(@RequestBody User user){
    usr.save(user);
   
    return "Added Successfully";
}

@GetMapping("/findAllUsers")
public List<User> getUser() {
   
    return usr.findAll();
}

@DeleteMapping("/delete/{id}")
public String deleteBook(@PathVariable int id){
    usr.deleteById(id);
   
    return "Deleted Successfully";
}

}
