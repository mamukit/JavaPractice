package classpractice;

public class Sep13thControlStatements {

	public static void main(String[] args) {
		/* Moh Mukit
		Date: 09/16/2020
		Problem: Java Control Statements Practice*/
			

				// Java If-Else conditional statement

				int number1 = 17;
				int number2 = 5;

				if (number1 > number2) {

					System.out.println("  number1 is the greater number = ");
				} else if (number2 > number1) {
					System.out.println(" number2 is the greater number = ");
				} else {
					System.out.println(" Both numbers are equal = ");
				}

				// Nested If-Else statement
				if (number1 >= number2) {

					if (number1 > 9) {
						if (number1 < 11) {
							System.out.println(" Number is 10 = ");
						} else {
							System.out.println(" This is not right  Number =");
						}
					} else {
						System.out.println(" Wrong Number =");
					}

				}

				// Switch statement

				int day;

				day = 4;

				switch (day) {

				case 1:
					System.out.println(" Sunday");
					break;
				case 2:
					System.out.println(" Monday");
					break;
				case 3:
					System.out.println(" Tuesday");
					break;
				case 4:
					System.out.println(" Wednesday");
					break;
				case 5:
					System.out.println(" Thursday");
					break;
				case 6:
					System.out.println(" Friday");
					break;
				case 7:
					System.out.println(" Saturday");
					break;

				default:
					System.out.println(" Invalid Input");

				}

				System.out.println(" I am here now");

				// Java While Loop
				int counter1 = 11;

				while (counter1 < 10) {

					System.out.println(" Running around the block " + counter1 + " times");
					counter1++;
				}

				// Java Do While loop

				int counter2 = 1;

				do {
					System.out.println(" TalenTech");
					counter2++;

				} while (counter2 <= 10);

				// For loop
				int count;
				for (count = 0; count < 5; count++) {
					System.out.println(" Executing For Loop");

				}

	}

}
