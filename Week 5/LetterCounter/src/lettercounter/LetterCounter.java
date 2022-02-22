/*
 * This class was developed by Callum Young
 * Date: 22-Feb-2022
 */
package lettercounter;

import java.util.*;

public class LetterCounter {

    // Creates a instance array to store all the letters in the alphabet
    public char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
        'x', 'y', 'z'};

    // Runs when the package is compiled
    public static void main(String[] args) {
        // Creates the needed local variables
        boolean running = true;
        String input, keepRunning;

        // Creates a new LetterCounter object to run the methods
        LetterCounter letterCounter = new LetterCounter();
        // Creates the Scanner object to get user input
        Scanner scan = new Scanner(System.in);

        // Runs while the user wants the program to run
        do {
            // Asks the user to enter a string
            System.out.println("Please enter the string you wish to count "
                    + "the characters of below.");
            // Gets the users input string
            input = scan.nextLine();

            // Outputs the count of letters for the inputed string
            letterCounter.outputLetterCount(input);

            // Asks the user if they would like to run again
            System.out.println("Would you like to analyse another string? "
                    + "(Enter 'y' or 'yes' to run the program again)");
            // Gets the users response
            keepRunning = scan.nextLine();

            // Runs if the user does not enter y or yes
            if (!(keepRunning.equalsIgnoreCase("y")
                    || keepRunning.equalsIgnoreCase("yes"))) {
                // Tells the program to exit the loop
                running = false;
            }

            // Outputs a new line for better formating
            System.out.println();
        } while (running);

        // Tells the user the program has ended
        System.out.println("Program terminating, Goodbye");
    }

    // Creates a method to output the count of each letter in a string
    public void outputLetterCount(String input) {
        // Gets the frequency of each letter as an array
        int[] frequency = getLetterCount(input);

        // Outputs the header for the output for nice formating
        System.out.println("\nLetter: Frequency");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Runs for each letter
        for (int j = 0; j < letters.length; j++) {
            // Outputs the letter and it's count
            System.out.print(letters[j] + ": " + frequency[j] + "\t");

            // Adds a new line every 4 itterations for better formating
            if ((j + 1) % 4 == 0) {
                System.out.println();
            }
        }
        // Outputs a new line for better formating
        System.out.println("\n");
    }

    // Creates a method to count the number of each letter in a string
    private int[] getLetterCount(String input) {
        // Declares the needed local variables
        char character;
        int letterIndex;
        // Creates the array to store the frequency of each letter
        int[] frequency = new int[letters.length];

        // Converts input to lowercase
        input = input.toLowerCase();

        // Runs for each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Gets the character at the current loop index
            character = input.charAt(i);
            // Gets the index of that character in the letters array
            letterIndex = Arrays.binarySearch(letters, character);

            // Only runs if an index is found
            if (letterIndex >= 0) {
                // Increments the frequency for the character index
                frequency[letterIndex]++;
            }
        }

        // Returns the frequency array
        return frequency;
    }

}
