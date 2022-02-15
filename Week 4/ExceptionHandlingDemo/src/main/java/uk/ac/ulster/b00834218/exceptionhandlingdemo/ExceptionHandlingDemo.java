/*
 * Class created by Callum Young
 * Created: 15 Feb 2022
 * Last Updated: 15 Feb 2022
 */
package uk.ac.ulster.b00834218.exceptionhandlingdemo;

import java.util.*;

public class ExceptionHandlingDemo {

    // Runs first when ExceptionHandlingDemo class is called
    public static void main(String[] args) {
        // Declares the variables
        int[] intArray = new int[10];
        int index, divisor, result, upperLimit = 100;
        boolean halt = false;
        String input = "";

        // Creates the random and scanner objects
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // Runs for every element in the intArray array
        for (int i = 0; i < intArray.length; i++) {
            // Sets the array value at the index to a random number
            intArray[i] = rand.nextInt(upperLimit) + 1;
        }

        // Runs until the user wants to stop the program
        do {
            // Prints context for the information to come
            System.out.println("\nValues in the array...");
            // Runs for every element in the intArray array
            for (int i = 0; i < intArray.length; i++) {
                // Outputs the value in the array at the index
                System.out.println("Index " + i + ": " + intArray[i]);
            }

            try {
                // Gets the user to input an index
                System.out.println("\nWhat is the index of the number"
                        + "you wish to divide?");
                input = scan.next();
                index = Integer.parseInt(input);

                // Stores the desired value
                result = intArray[index];

                // Gets the user to input a diviser
                System.out.println("What do you want to divide that number by?");
                input = scan.next();
                divisor = Integer.parseInt(input);

                // Devides the result by the desired divisor
                result /= divisor;

                // Tells the user the calculation that took place
                System.out.println("\nElement " + index + " (" + intArray[index]
                        + ") divided by " + divisor + " is " + result);

                // Stores the result in the array
                intArray[index] = result;
            } catch (NumberFormatException e) {
                // Tells the user that the input is not a valid number
                System.out.println("Error: " + input
                        + " is not a valid number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Tells the user that index is not in the array
                System.out.println("Error: " + input
                        + " is not a valid array index.");
            } catch (ArithmeticException e) {
                // Tells the user they cannot divide by 0
                System.out.println("Error: you cannot divide by 0.");
            }

            // Gets if the user wants to continue or halt
            System.out.println("\nDo you want to divide again?"
                    + " Type 'y' for yes");
            input = scan.next();

            // Tells the program to halt if the user wants to stop
            if (!input.toLowerCase().equals("y")) {
                halt = true;
            }

        } while (!halt);
    }

}
