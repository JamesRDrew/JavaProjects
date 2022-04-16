// A method for swapping variables when necessary 

public class swapVariablesPractice {

	public static void main(String[] args) {
		
		// Initialize variables 
		String x = "water";
		String y = "Kool-Aid";
		String temp; // Declare an extra empty variable
		
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		// use the third variable to swap variable values 
		temp = x;
		System.out.println("Temp has been set to: "+temp);
		
		x = y;
		System.out.println("x has been set to: "+x);
		
		y = temp;
		System.out.println("y has been set to :"+y);
	} // End main method

} // End class swapVariablesPractice
