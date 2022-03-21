/*
 * Class created by Callum Young
 * Created: 21 Mar 2022
 * Last Updated: 21 Mar 2022
 */
package uk.ac.ulster.b00834218.speaknumber;

public class SpeakNumber {

    //Declare an array where the value at the intger position is the word to be used
    private final static String[] SMALL_NUMS = new String[]{"zero", "one", "two",
        "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sisteen",
        "seventeen", "eighten", "nineteen"};

    //Declare an array for the tens
    private final static String[] TENS = new String[]{"", "", "twenty",
        "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    //A method that Accepts any positive integer less than 1000000
    //and returns its spoken equivalent in English
    public static String speakNumber(int n) {
        if (n < -1000000) {
            return "ERROR: Number out of range";
        } else if (n < 0) {
            return "negative " + speakNumber(-n);
        } else if (n < 20) {
            return SMALL_NUMS[n];
        } else if (n < 100) {
            return TENS[n / 10]
                    + (n % 10 == 0 ? "" : "-" + speakNumber(n % 10));
        } else if (n < 1000) {
            return speakNumber(n / 100) + " hundred"
                    + (n % 100 == 0 ? "" : " and " + speakNumber(n % 100));
        } else if (n < 1000000) {
            return speakNumber(n / 1000) + " thousand"
                    + (n % 1000 == 0 ? ""
                            : (n % 1000 < 100 ? " and " : ", ")
                            + speakNumber(n % 1000));
        } else {
            return "ERROR: Number out of range";
        }
    }

    // Runs first when SpeakNumber class is called
    public static void main(String[] args) {
        int[] numsToSpeak = {0, 7, 17, 27, 67, 20, 90, 127, 667, 200, 901,
            123127, 540667, 20200, 90001, 999999, 1000002};

        for (int num : numsToSpeak) {
            System.out.println(speakNumber(num));
            System.out.println(speakNumber(-num));
        }
    }

}
