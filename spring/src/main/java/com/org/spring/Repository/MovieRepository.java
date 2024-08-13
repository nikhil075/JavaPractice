package com.org.spring.Repository;

import org.springframework.stereotype.Repository;

@Repository 
public class MovieRepository {
     public MovieRepository Add(String movieName) {
		if(movieName==null) {
			throw new RuntimeException();
		}
		else {
			System.out.println("movie got added");
    	 return this;
    	 
     }
}

public boolean delete(String movieName) {
	if(movieName== null) {
		throw new RuntimeException();
	}else
	{
		return true;
	}
}
}