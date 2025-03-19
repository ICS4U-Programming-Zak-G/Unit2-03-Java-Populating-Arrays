// Import libraries
import java.util.Random;
import java.util.Arrays;

/** .
* This program generates 5 lines of random integers
* between 0-100, and 10 per line.
* They are then sorted and the average is found of each line.
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-03-17
*/

// Creating class
public final class PopulatingArrays {

    // Declare constants

    /** .
     * MAX is the highest the random integers can go.
     */
    private static final int MAX = 99;

    /** .
     * MIN is the lowest the random integers can go.
     */
    private static final int MIN = 1;

    /** .
     * MAX_SIZE is the max size of the array.
     */
    private static final int MAX_SIZE = 10;

    /** .
     * MAX_LINES is the max number of lines for the program.
     */
    private static final int MAX_LINES = 5;

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private PopulatingArrays() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) throws Exception {

        // Initialize variables
        int randNumber = 0;
        int lineCounter = 1;
        double average = 0;

        // Introduce program to user
        System.out.println("This generates 5 lines of random numbers,\n"
                + "each having 10 integers and the average is"
                + " then calculated.\n");

        // Create instance of random class
        Random rand = new Random();

        // Create array
        Float[] arrayNum = new Float[MAX_SIZE];

        // Loop process while less than 5 lines made
        do {
            // Initialize sum
            Float sum = 0.0f;

            // Loop and populate array with random numbers until full
            for (int counter = 0; counter < MAX_SIZE; counter++) {

                // Get random number between 0-100
                randNumber = rand.nextInt(MAX - MIN + 1) + MIN;

                // Populate array with random numbers and turn to floats
                arrayNum[counter] = randNumber * 1.0f;
            }

            // Sort array
            Arrays.sort(arrayNum);

            // Calculate sum
            for (int indexCounter = 0; indexCounter < MAX_SIZE;
                 indexCounter++) {
                sum += arrayNum[indexCounter];
            }

            // Calculate average
            average = sum / MAX_SIZE;

            // Print array using for loop
            for (int arrayCounter = 0; arrayCounter < MAX_SIZE;
                 arrayCounter++) {
                System.out.print(arrayNum[arrayCounter] + " ");
            }

            // Print average
            System.out.print("Average: ");
            System.out.format("%.2f", average);
            System.out.println();

            // Increment counter
            lineCounter++;

        // Loop while 5 lines haven't been made
        } while (lineCounter <= MAX_LINES);
    }
}
