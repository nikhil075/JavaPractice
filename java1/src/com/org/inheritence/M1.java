package com.org.inheritence;

public interface M1 {
          void  print();
          static void methoda() {
        	  System.out.print("Interface 1");
          }
          
          default void methodb() {
        	  System.out.print("Default m1");
          }
}
