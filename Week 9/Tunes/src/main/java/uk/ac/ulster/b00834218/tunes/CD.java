/*
 * Class created by Callum Young
 * Created: 21 Mar 2022
 * Last Updated: 21 Mar 2022
 */
package uk.ac.ulster.b00834218.tunes;

public class CD {

    // Properties
    private String title, artist;
    private double value;
    private int tracks;

    // Constructor
    public CD(String title, String artist, double value, int tracks) {
        this.title = title;
        this.artist = artist;
        this.value = value;
        this.tracks = tracks;
    }

    // Prints out the details of a CD
    public void printDetails() {
        System.out.println("CD title: " + this.title);
        System.out.println("Artist's name: " + this.artist);
        System.out.println("CD value: " + to2DP(this.value));
        System.out.println("No. of tracks: " + this.tracks);
    }

    // Private method to convert a double to a string with 2 decimal places
    public static String to2DP(double value) {
        // Rounds the value to 2 decimal places
        value = Math.round(value * 100) / 100.0;
        // Returns the formated value
        return String.format("%.2f", value);
    }

}
