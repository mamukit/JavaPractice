package com.practice;

public class SuperCons {
	int value;
	String text;

	public SuperCons() {
		this(5);
		System.out.println("First Constructor");
		value = 12;

	}

	public SuperCons(int value) {
		this.value = value;
		System.out.println("Second Constructor");
	}

	public SuperCons(int value, String text) {
		this();
		this.value = value;
		this.text = text;

		System.out.println("Third Constructor");


	}
}
