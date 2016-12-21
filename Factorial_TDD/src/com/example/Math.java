package com.example;

public class Math {

	public int getFactorial(int num){
		
		if(num==0 || num ==1){
			return 1;
		}
		
		if(num<0){
			throw new IllegalArgumentException();
		}
				
		return 1;
	}
	
}
