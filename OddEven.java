// This program is intended to accept an integer from the user and determine if it's even or odd

import java.util.Scanner; 

public class OddEven {

	public static void main(String[] args) {
		// Create a scanner to accept input from user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your number: ");
		int num1 = input.nextInt();
		
		int result = num1 % 2; 
		
		if (result == 0)
			System.out.println("The number is Even.");
		
		if (result != 0)
			System.out.println("The number is Odd.");
		
		
	}

}
