// 7.11 Write statements that perform the following one-dimensional-array operations
//a) Set the 10 elements of integer array counts to zero.
//b) Add one to each of the 15 elements of integer array bonus.
//c) Display the five values of integer array bestScores in column format.


public class arrayStatements {

	public static void main(String[] args) {
		
		// Set 10 elements of integer array count to 0 
		int[] array = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int counter = 0; counter < array.length; counter++) {
			
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

		
		System.out.printf("%n%n");
		
		
		//b) Add one to each of the 15 elements of integer array bonus.
		int[] bonus = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int counter = 0; counter < bonus.length; counter++) {
			bonus[counter]+=1;
			
			System.out.printf("%5d%8d%n", counter, bonus[counter]);
		}
		
		System.out.printf("%n%n");
		
		
		//c) Display the five values of integer array bestScores in column format.
		int[] bestScores = {50, 60, 70, 80, 90};
		
		System.out.printf("%s%8s%n", "Student", "Score");
		
		for (int counter = 0; counter < bestScores.length; counter++) {
			
			System.out.printf("%5d%8d%n", counter, bestScores[counter]);
		}
		
	}

}
