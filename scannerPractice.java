// Used to practice using the scanner package to accept user input

// Import the scanner package 
import java.util.Scanner;

public class scannerPractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Declare instance of scanner named input to accept input from user
		
		// Get string type input from user
		System.out.println("What is your name? ");
		String name = input.nextLine(); // Get the user to enter name and assign it to variable name for use later
		System.out.println("Hello "+name);
		
		// Get int type input from user 
		System.out.println("How old are you? ");
		int age = input.nextInt();
		input.nextLine(); // Use this method to clear out the scanner of the \n command left over from input since line 19 only reads int type input.
		System.out.println("Wow! Youre already "+age+" years old!!" );
		
		System.out.println("What is your favorite food? ");
		String food = input.nextLine();
		System.out.println("You like " +food);
	} // End main method

} // End class scannerPractice
