/**This program simulates a slot machine. The user is asked for how much
 * money he or she wants to bet. Three Random numbers are generated in
 * relation to words found in a typical slot machine. If no word matches
 * are found in the current round, no money is won. If two words match,
 * then earnings equal to double of the round's bet. When all three words
 * match, then earnings equal to triple of the round's bet. The user is
 * asked to play again, to repeat the process; if not, the total money
 * spent and the total winnings are displayed*/

import javax.swing.JOptionPane;         // for dialog boxes
import java.util.Random;                // for Random class

// public program class
public class SlotMachineSimulation{

    // main method
    public static void main(String[] args){

        final byte NUM_WORDS = 3;       // total number of random words

        String betString;               // bet entered from dialog box
        String randWord = "";           // to hold a random word
        String word1 = "";              // to hold first random word
        String word2 = "";              // to hold second random word
        String word3 = "";              // to hold third random word
        String again;                   // holds user's choice to play again
        double bet;                     // contains round bet
        double won;                     // contains round winnings
        double winnings = 0.0;          // accumulator for total winnings
        double moneySpent = 0.0;        // accumulator for total money spent
        Random rand = new Random();     // Create a random class object

        // A user controlled do-while loop as long as the user wants to play
        // again and "cancel" is not selected on the dialog box
        do {

            // Ask the user to enter the round's bet amount
            betString = JOptionPane.showInputDialog("Enter bet amount:");

            // If the user cancels the dialog box, end the program
            if(betString == null) {
                System.exit(0);
            }

            // The bet amount is converted from a String to a double
            bet = Double.parseDouble(betString);

            // Iterate three times to obtain three random words
            for (int i = 0, count = 0; i < NUM_WORDS; i++, count++) {

                // Initialize variable randWord to one of the six words
                switch (rand.nextInt(6)) {
                    case 0:
                        randWord = "Cherries";
                        break;
                    case 1:
                        randWord = "Oranges";
                        break;
                    case 2:
                        randWord = "Plum";
                        break;
                    case 3:
                        randWord = "Bells";
                        break;
                    case 4:
                        randWord = "Melons";
                        break;
                    case 5:
                        randWord = "Bars";
                        break;
                    default:
                        break;
                }

                // Switch statement to obtain three words
                switch (count) {
                    case 0:
                        word1 = randWord;
                    case 1:
                        word2 = randWord;
                    case 2:
                        word3 = randWord;
                }
            }

            // Determine two, three, or no matching
            // words and calculate round winnings
            if (!(word1.equals(word2)) && !(word2.equals(word3)) && !(word1.equals(word3))) {
                won = 0.0;
            }
            else if (word1.equals(word2) && word2.equals(word3)) {
                won = bet * 3;
            }
            else {
                won = bet * 2;
            }

            // Calculate a running total of total
            // money spent and total winnings
            moneySpent += bet;
            winnings += won;

            // Display the three random words
            JOptionPane.showMessageDialog(null,
                    String.format("%s %s %s\nYou won $%.2f.", word1, word2, word3, won));

            // Ask the user to play again
            again = JOptionPane.showInputDialog("Play again?");

            // Exit if the user clicks cancel in the dialog box
            if (again == null) {
                System.exit(0);
            }

        } while (again.equalsIgnoreCase("yes"));

        // Display total money spent and total winnings
        JOptionPane.showMessageDialog(null,
                String.format("Total Spent: $%.2f\n" + "Total Winnings: $%.2f", moneySpent, winnings));

        // Exit the program
        System.exit(0);
    }
}