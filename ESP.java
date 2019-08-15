import javax.swing.JOptionPane;     // For dialog boxes
import java.util.Random;            // For Random class

public class ESP{

    // Main method
    public static void main (String[] args){

        final int TIMES = 10;       // Number of iterations

        int randomNum;              // Holds random number
        int correct = 0;            // Accumulator for correct guesses
        String color;               // Random computer color
        String userColor;           // User's color guess

        // Loop 10 times
        for (int i = 0; i < TIMES; i++){

            // Get a random number
            randomNum = randomNumberGenerator();

            // Use the random number to get its corresponding color
            color = getRandomColor(randomNum);

            // Get a user color
            userColor = getUserColor();

            // Display the computer's color
            showRandomColor(color);

            // If there is a color match, increment the color variable, otherwise do nothing
            correct = colorMatch(color, userColor) ? correct + 1 : correct;
        }

        // Display number of correct guesses
        showNumberOfCorrectGuesses(correct);

        // Exit the program
        System.exit(0);
    }

    /**
     * This method returns a random number.
     * @return A random number within 0 through 5
     * is returns.
     */
    public static int randomNumberGenerator(){

        // Create a random object
        Random rand = new Random();

        // Return a random number within the range of 0 through 5
        return rand.nextInt(5);
    }

    /**
     * This method returns the corresponding random number's color.
     * @param num A random number parameter.
     * @return A color is returned.
     */
    public static String getRandomColor(int num){

        // Create an empty string object
        String color = "";

        // Choose appropriate color case
        switch (num){
            case 0:
                color =  "Red";
                break;
            case 1:
                color =  "Green";
                break;
            case 2:
                color =  "Blue";
                break;
            case 3:
                color =  "Orange";
                break;
            case 4:
                color =  "Yellow";
                break;
        }

        // Return the color
        return color;
    }

    /**
     * This method gets the user's color guess.
     * @return The user's color guess is returned.
     * */
    public static String getUserColor(){

        // Return the user's color guess
        return JOptionPane.showInputDialog("Guess the computer's color:");
    }

    /**
     * This method displays the random color.
     * @param color This is the random color
     */
    public static void showRandomColor(String color){
        JOptionPane.showMessageDialog(null, String.format("The computer's color is: %s", color));
    }

    /**
     * This method tests for a color match between the computer and user's answer.
     * @param color1 The first string to compare.
     * @param color2 The second string to compare.
     * @return Returns true if both strings are equal, false otherwise*/
    public static boolean colorMatch(String color1, String color2){

        // Return true if colors equal, false otherwise
        return color1.equalsIgnoreCase(color2);
    }

    /**
     * This method displays a message showing the number of correct guesses.
     * @param correct Number of correct guesses.
     */
    public static void showNumberOfCorrectGuesses(int correct){

        // Display the correct number of guesses
        JOptionPane.showMessageDialog(null, String.format("Number of correct guesses: %d", correct));
    }
}