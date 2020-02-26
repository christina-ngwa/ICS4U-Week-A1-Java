import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* This program finds the length of the largest length.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-23
*/

public class MaxRun {
  /**
  * This program finds the length of the largest length.
  */
  public static void main(String[] args) throws IOException {

    // variables and constants
    int runCount = 0;
    int maxRun = 1;
    char previous = '\u0000';// null character (terminates remaining string)
    String string;

    // input reader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // output
    System.out.println("Let’s find the length of the largest run in a string.");
    System.out.print("\nEnter a string: ");
    string = br.readLine();

    // process
    if (!string.matches("[a-zA-Z]+")) { // regex (checks if input is a string or not)
      System.out.print("Please enter a string.");
    } else {
      for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == previous) { 
          runCount++;
          if (runCount > maxRun) {
            maxRun = runCount;
          }
        }
        previous = string.charAt(i);
      }
      // ouput
      System.out.print("\nThe longest run is " + maxRun + ".");
    }

  }
}