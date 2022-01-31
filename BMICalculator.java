// This program accepts a users weight and height to calculate BMI 

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a scanner to get input 
		Scanner input = new Scanner(System.in);
		
		// Get weight from user
		System.out.println("Please enter your weight in lbs: ");
		int weight = input.nextInt();
		
		// Get height from user
		System.out.println("Please enter your height in inches: ");
		int height = input.nextInt();
		
		// Calculate the BMI 
		int result = (weight * 703) / (height * height);
		
		// Display the result
		System.out.printf("%s%n%d", "Your BMI is:", result);
		
		
		
		
		
	}

}
