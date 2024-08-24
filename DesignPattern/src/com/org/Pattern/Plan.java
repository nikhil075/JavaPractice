package com.org.Pattern;

import java.io.*;      
public abstract class Plan{  
         protected double rate;  
         abstract void getRate();  
   
         public void calculateBill(int units){  
              System.out.println(units*rate);  
          }  }


 
//end of CommercialPlan class.  
