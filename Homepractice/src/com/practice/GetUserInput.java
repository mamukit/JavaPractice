package com.practice;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal number: ");
		
		double number = input.nextDouble();

		System.out.println("Your number is: " + number);

	}

}
