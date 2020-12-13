package com.practice;

public class FinalStatic {

	public static final int MY_CONSTANT = 8;

	public String name;
	public static String studentClass;
	public static int count = 0;

	public FinalStatic() {
		count++;
	}

	public void studentName() {
		System.out.println(name + " is enrolled in: " + studentClass);
	}

	public static void classInfo() {

		System.out.println(studentClass);
		// This gives you an error! System.out.println(name);
	}


}
