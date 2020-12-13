package com.practice;

//Java program to convert primitive into objects  
//autoboxingggg example of integer to Integer  



public class WrapperClass {

	
	
	public static void main(String args[]){  
	//Converting integer into Integer  
	int a=29;  
	Integer i=Integer.valueOf(a); //converting integer into Integer explicitly  
	Integer j=a;  //autoboxing, now compiler will write Integer.valueOf(a) internally  
	  
	System.out.println(a+" "+i+" "+j);  
	
	} 
}
