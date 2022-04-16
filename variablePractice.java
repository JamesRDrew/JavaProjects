// Used to practice declaring variables 

public class variablePractice {

	public static void main(String[] args) {
		
		int x; // declare variable type 
		x = 123; // assign data to variable 
		int y = 345; // Initialization combines declaration and assignment into one statement 
		
		float a = 3.14f; // to use a float data type make sure to follow value with f
		double b = 3.14; // double is more accurate and doesn't need f therefore more common
		
		boolean z = true; //true false statements
		char symbol = '@'; // stores specific characters. Use ''
		String name = "James Drew"; // Stores a string of characters, uses a capital S variable type because its a reference data type. 
		
		// Display different variables 
		System.out.println("My number is: " + x); // string concatenation uses + variable outside of "" to add variable value to statement.
		System.out.println("X = " + x);
		System.out.println("y = " + y);
		System.out.println("The value of float a is " + a);
		System.out.println("Double b = " + b);
		System.out.println("Boolean Z is" + z);
		System.out.println("the symbol is " + symbol);
		System.out.println("My Name is " + name);
		
		
		

	} // End main method

} // End class variablePractice
