//4.21 (Find the Largest Number) The process of finding the largest value is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the con- test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter- mines and prints the largest integer. Your program should use at least the following three variables:
//a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed).
//b) number: The integer most recently input by the user.
//c) largest: The largest number found so far.

import java.util.Scanner; // class uses input from user


public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a scanner for input 
		Scanner input = new Scanner(System.in);
		
		//Create variables
		int counter = 0;
		
		int largest = 0;
		
		while (counter != 10) {
			//Prompt user for input
			System.out.println("Please enter a number:");
			int number = input.nextInt();
			
			//Compare and if necessary set a new largest
			if (number > largest)
				largest = number;
			
			//Add 1 to the counter
			counter++;
		}
			
		System.out.printf("The largest number is %d", largest);
			
			
		}
				
		
	}


