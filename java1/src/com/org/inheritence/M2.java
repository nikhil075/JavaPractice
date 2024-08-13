package com.org.inheritence;

public interface M2 {
	
        void  print();
        static void methoda() {
      	  System.out.print("Interface 2");
        }
        
        default void methodb() {
      	  System.out.print("Default m2");
        }
}


