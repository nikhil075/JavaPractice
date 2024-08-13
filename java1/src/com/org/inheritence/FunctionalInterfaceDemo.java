package com.org.inheritence;
import java.util.function.*; 

public class FunctionalInterfaceDemo {  
    public void int getSum(int[] arr, Predicate<Integer> condition){  
        int sum=0;
        for (int num:arr) {
        	if(condition.test(num)) {
        		sum +=num;
        	}
        }
        return sum;
    }  
    public static void main(String[] args) {  
    	int[] intArr = {1,2,3,4,5,6};
    	int evenSum = getSum(intArr , x-> x%2 ==0);
    
}  