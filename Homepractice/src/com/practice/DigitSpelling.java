package com.practice;

import java.util.Scanner;

public class DigitSpelling {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int digit;

		System.out.println("Enter any digit :    ");
		digit = input.nextInt();

		switch (digit) {

		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.print("Two");
			break;

		case 3:
			System.out.print("Three");

			break;

		case 4:
			System.out.print("Four");
			break;

		case 5:
			System.out.print("Five");
			break;

		case 6:
			System.out.print("six");
			break;

		case 7:
			System.out.print("Seven");

			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Nine");
			break;

		default:
			System.out.println("This is not a Digit");

			break;

		}

	}

}
