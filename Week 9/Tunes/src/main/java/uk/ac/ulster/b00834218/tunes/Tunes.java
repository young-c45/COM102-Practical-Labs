/*
 * Class created by Callum Young
 * Created: 21 Mar 2022
 * Last Updated: 21 Mar 2022
 */
package uk.ac.ulster.b00834218.tunes;

import java.util.Scanner;

public class Tunes {

    // Declares the scanner
    private static Scanner input;
    // Declares the CD collection
    private static CD_Collection collection;

    // Runs first when Tunes class is called
    public static void main(String[] args) {
        // Creates the scanner object
        input = new Scanner(System.in);
        // Creates the CD collection object
        collection = new CD_Collection();

        // Runs 4 times
        for (int i = 1; i <= 4; i++) {
            // Adds a new CD to the collection
            addUserInputCD(i);
            // Outputs an empty line for better formating
            System.out.println();
        }

        // Prints out the details of the collection
        collection.details();
    }

    // Adds a new CD to the collection from user input
    private static void addUserInputCD(int number) {
        // Gets the title
        System.out.println("What is the title of CD " + number + "?");
        String title = input.nextLine();
        // Gets the artist
        System.out.println("Who made CD " + number + "?");
        String artist = input.nextLine();
        // Gets the value
        System.out.println("What is the value of CD " + number + "?");
        double value = input.nextDouble();
        // Gets the tracks
        System.out.println("How many tracks are on CD " + number + "?");
        int tracks = input.nextInt();

        // Goes to the next line to prepare for the next input
        input.nextLine();

        // Adds the new CD object to the collection
        collection.addCD(title, artist, value, tracks);
    }

}
