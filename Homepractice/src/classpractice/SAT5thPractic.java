package classpractice;

public class SAT5thPractic {

	public static void main(String[] args) {
		/*name: Moh Mukit
		Date: 09/15/2020
		Problem: Solving Different Java Data Type Problems
		*/

		

				System.out.println("Hello World!");

				// Integer numbers:
				byte myByteData = 13;
				System.out.println("My Favorite Byte Data is: " + myByteData);

				short myFavoriteShortData; // Declaring the variable
				myFavoriteShortData = -32768; // Assigning value to the variable
				System.out.println("My Favorite Short Data is: " + myFavoriteShortData);
				myFavoriteShortData = 128;
				System.out.println("My Favorite Short Data is: " + myFavoriteShortData);

				int myIntData = 19;
				long myLongData = 2147483650L;
        
				System.out.println(" myIntData vlue is   " +myIntData);
				System.out.println(" myLongData vlue is  " +myLongData);
				
				// Floating point numbers:
				float myFloatData = 3.587561838193491348919f;
				System.out.println("Float number:" + myFloatData);
				double mydoubleData = 4.587561838193491348919;
				System.out.println("Double number:" + mydoubleData);

				// Characters:
				char myCharacter;
				myCharacter = 'a';
				System.out.println("Character: " + myCharacter);
				myCharacter = 'L';
				System.out.println("Character: " + myCharacter);

				// Booleans:
				boolean myBooleanData = true;
				System.out.println(myBooleanData);
				myBooleanData = false;
				System.out.println(myBooleanData);

				int data = 12;
				int data2 = data;
				int data3 = data2;
				data3 = 1;
				data = data3;
				float myFloat = data;
				System.out.println(myFloat);

			}

		

	}


