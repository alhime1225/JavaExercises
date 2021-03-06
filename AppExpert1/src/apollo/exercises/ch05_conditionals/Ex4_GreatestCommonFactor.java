package apollo.exercises.ch05_conditionals;

public class Ex4_GreatestCommonFactor {
	
	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call the greatestCommonFactor method a few times and print the results
		int x = greatestCommonFactor(20,30);
		System.out.println(x);
	}
	
	// Create a method called greatestCommonFactor
	// It should return the greatest common factor
	// between two numbers.  
	//
	// Examples of greatestCommonFactor:
	//   greatestCommonFactor(6, 4)   // returns 2
	//   greatestCommonFactor(7, 9)   // returns 1
	//   greatestCommonFactor(20, 30) // returns 10
	//
	// Hint: start a counter from 1 and try to divide both
	// numbers by the counter. If the remainder of both divisions
	// is 0, then the counter is a common factor. Continue incrementing
	// the counter to find the greatest common factor. Use a while loop
	// to increment the counter.

	private static int greatestCommonFactor(int x, int y) {
		int gcd = 1;
		for(int i = 1; i <= x && i <= y; i++)
		{
			if(x%i==0 && y%i==0)
				gcd = i;
		}for(int i = 1; i <= x && i <= y; i++)
		{
			if(x%i==0 && y%i==0)
				gcd = i;
		}
		return gcd;
	}


}

/*
 * SAMPLE OUTPUT:
 * 
 * 2
 * 1
 * 0
 * 
 */