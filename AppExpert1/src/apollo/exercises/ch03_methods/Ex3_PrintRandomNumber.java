package apollo.exercises.ch03_methods;

// The program that can print random numbers
public class Ex3_PrintRandomNumber {

  // This is the main method that is executed as
  // soon as the program starts.
  public static void main(String[] args) {

    // Create a method that returns a random number
    // between min and max.
    //
    // PrintRandomNumber(int min, int max)
    //
    // Save the return value in a variable and print
    // the random number.
    //
    // HINT: To generate a random number from 0 to 40:
    //
    //    Random rand = new Random();
    //    rand.nextInt(40);
	  System.out.println(randomNumber(2,10));
  }

  public static int randomNumber(int min, int max) {
	  int rnd = (int)(Math.random() * (max - min) + min);
	  double test = Math.random();

	  System.out.println(test);
	  return rnd;
  }
}

/*
 * SAMPLE OUTPUT:
 *  
 *   My random number is 13
 *   My random number is 78
 *   
 */