package com.practice;

public class UnBoxWrapper {

	//Java program to convert object into primitives  
	//Unboxing example of Integer to int  
	  
	public static void main(String args[]){    
	//Converting Integer to integer    
	Integer a=new Integer(3);    
	int i=a.intValue();//converting Integer to integer explicitly  
	int j=a; // unboxing, now compiler will write a.intValue() internally    
	    
	System.out.println(a+" "+i+" "+j);    
	}    
}
