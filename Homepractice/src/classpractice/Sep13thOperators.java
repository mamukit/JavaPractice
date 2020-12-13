package classpractice;

  public class Sep13thOperators {

	
	
	/*Author: Moh  Mukit
	Date: 09/16/2020
	Problem: Java Operator Practice*/


  public static void main(String args[] ) {
	


			// Arithmetic Operations

			// Addition, Subtraction, Multiplication, Division, Remainder
			// + , - , * , /, %

			int num1 = 10, num2 = 3;
			int result1; 
			float result2;
            
            
			result1 = num1 + num2;
			System.out.println(" Result : " + result1);

			String str1 = "Hello";
			String str2 = " How";
			String str3 = " Are You";

			String finalString = str1 + str2 + str3;
			System.out.println(finalString);

			result1 = num1 - num2;
			System.out.println(" Result : " + result1);

			result1 = num1 / num2;
			System.out.println(" Result : " + result1); // 3

			result2 = num1 / num2; // 3
			System.out.println(" Result : " + result2); // 3.0

			float num3 = 10; // 10.0
			int num4 = 3;
			result2 = num3 / num4; // 3.33
			System.out.println("result : " + result2);

			System.out.println( num3 + num4);
			System.out.println( num3 - num4);
			System.out.println( num3 * num4);
			System.out.println( num3 / num4);
			System.out.println( num3 % num4);

			// Relational Operator: 1. Comparison 2. Equality
			// Comparison: < , > , <= , >= , instanceof
			// Equality: ==, !=

			// logical Operators: logical AND - '&&' , logical OR - '||"

			// Bitwise operators: &, |, ^
			// Shift operators: >>, <<, >>>, <<<

			int myNum1 = 2;
			int myNum2 = 3;
			int myNum3 = myNum1 & myNum2;
			System.out.println(" myNum3: " + myNum3);

			myNum3 = myNum1 | myNum2;
			System.out.println(" myNum3: " + myNum3);

			// Unary Operator: ++ , --
			// Post Incremental: a++, a-- , Pre Incremental: ++a, --a

			int a = 5;
			// a++; // a = a+1;
			System.out.println(" a = " + a); // 6

			a--; // a = a-1;
			System.out.println(" a = " + a); // 5

			++a; // a = a+1;
			System.out.println("  a = " + a); // 6

			--a; // a = a-1;
			System.out.println(" a = " + a); // 5

			int b = 6; // post
			int temp1;
			temp1 = b++; // b = b+1
			// temp1 = 6
			// b = 6+1

			System.out.println(" temp1 value is : " + temp1);
			System.out.println(" B value is : " + b);

			int bb = 6; // pre
			int temp2;
			temp2 = ++bb; // b = b+1
			// b=6+1
			// temp2=b
			System.out.println("  temp2: " + temp2);
			
			
			//Ternary Operator:  >>   operand1 ? operand2 : operand3
			
			int number1  = 19;
			int number2  = 16;
			int biggerNumber;
			
			biggerNumber = (number2>number1)? number2 : number1;
			System.out.println("  Bigger Number Is:  "+biggerNumber);

}			
}
