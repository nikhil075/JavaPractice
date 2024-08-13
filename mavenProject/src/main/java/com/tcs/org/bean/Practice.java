package com.tcs.org.bean;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Practice {
     public static Integer solve(Integer A,Integer B) {
		try {
			return A/B;
		} catch (Exception e) {
			// TODO: handle exception
			return -1;
		}
		}
     
     
     public static List<Integer> divide (List<Integer> l,Integer x){
    	 return l.stream()
    			 .map(n->solve(n,x))
    					 .collect(Collectors.toList());
     }

     public static void main(String args[]) {
    	 List<Integer> l= new ArrayList(); 
		l.add(24);
		l.add(74);
		System.out.println(divide(l,2));
		
	}
     }
