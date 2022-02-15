/*
 * Class created by Callum Young
 * Created: 15 Feb 2022
 * Last Updated: 15 Feb 2022
 */
package uk.ac.ulster.b00834218.name;

import java.util.*;

public class Name {

    // Runs first when Name class is called
    public static void main(String[] args) {
        // Declares the variable to store the name
        String name;

        // Creates the scanner object
        Scanner scan = new Scanner(System.in);

        // Asks the user for the name
        System.out.println("What is the name you wish to interpret?");
        // Gets the user's input
        name = scan.nextLine();

        // Outputs the first name
        System.out.println("First name: " + firstName(name));
        // Outputs the last name
        System.out.println("Last name: " + lastName(name));
        // Outputs the shortened name
        System.out.println("Short name: " + shortName(name));
    }

    // Method to return the first name
    public static String firstName(String name) {
        // Declares the variables
        String fName = "";
        String[] splitName;

        // Splits the string by a space and stores the output
        splitName = name.split(" ");

        // Runs for all the strings in the splitName array except the last
        for (int i = 0; i < splitName.length - 1; i++) {
            // Adds the string to the fName string
            fName += splitName[i] + " ";
        }
        // Trims whitespace at the begining and end of the fName string
        fName = fName.trim();

        // Returns the first name
        return fName;
    }

    // Method to return the last name
    public static String lastName(String name) {
        // Declares the variables
        String lName = "";
        String[] splitName;

        // Splits the string by a space and stores the output
        splitName = name.split(" ");

        // Stores the last string in the splitName array
        lName = splitName[splitName.length - 1];

        // Returns the last name
        return lName;
    }

    // Method to return the shortened name
    public static String shortName(String name) {
        // Declares the variables
        String sName = "";
        String[] splitName;

        // Splits the string by a space and stores the output
        splitName = name.split(" ");

        // Runs for all the strings in the splitName array except the last
        for (int i = 0; i < splitName.length - 1; i++) {
            // Adds the initial to the sName string
            sName += splitName[i].substring(0, 1) + ". ";
        }

        // Adds the last string in the splitName array to the sName string
        sName += splitName[splitName.length - 1];

        // Returns the shortened name
        return sName;
    }
}
