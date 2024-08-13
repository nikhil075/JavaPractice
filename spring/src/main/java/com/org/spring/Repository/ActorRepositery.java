package com.org.spring.Repository;

import org.springframework.stereotype.Repository;

@Repository 
public class ActorRepositery {
     public ActorRepositery Add(String ActorName) {
		if(ActorName==null) {
			throw new RuntimeException();
		}
		else {
			System.out.println("Actor got added");
    	 return this;
    	 
     }
}

public boolean delete(String ActorName) {
	if(ActorName== null) {
		throw new RuntimeException();
	}else
	{
		return true;
	}
}}
