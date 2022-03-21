/*
 * Class created by Callum Young
 * Created: 21 Mar 2022
 * Last Updated: 21 Mar 2022
 */
package uk.ac.ulster.b00834218.tunes;

public class CD_Collection {

    // Properties
    private CD[] collection; // The collection of cds
    private int size; // Total number of CDs in the collection
    private double valueCDs; // Total value of the CD collection

    // Constructor
    public CD_Collection() {
        // Creates an initially empty array 'collection' of 10 CDs
        collection = new CD[10];
        // Sets size and valueCDs equal to 0
        size = 0;
        valueCDs = 0;
    }

    // Creates a new CD object and adds the new CD to the collection
    public void addCD(String title, String artist, double value, int tracks) {
        // Creates and adds the new CD
        collection[size] = new CD(title, artist, value, tracks);
        // Increases the total value of the collection
        valueCDs += value;
        // Increases the number of CDs in the collection by 1
        size++;
    }

    // Prints out the details of all the CDs currently held in the array
    // collection and the average value of a CD
    public void details() {
        // Runs for each of the CDs
        for (CD cd : collection) {
            // Exits the loop if the CD doesn't exist
            if (cd == null) {
                break;
            }
            // Outputs the CD's details
            cd.printDetails();
            // Outputs a blank line for better formating
            System.out.println();
        }
        // Outputs the average value of the CDs
        System.out.println("Average CD value: " + CD.to2DP(averageValue()));
    }

    // Private method to calculate and return the average cost of the collection
    private double averageValue() {
        // Returns the value of the collection divided by the number of CDs
        return valueCDs / size;
    }

}
