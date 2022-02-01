/*
 * Class created by Callum Young
 * Created: 1 Feb 2022
 * Last Updated: 1 Feb 2022
 */
package uk.ac.ulster.b00834218.plustest;

public class PlusTest {

    // Runs first when PlusTest class is called
    public static void main(String[] args) {
        // Concatinates 2 strings so they become one
        System.out.println("This is a long string that is the "
                + "concatenation of two shorter strings.");
        // OUTPUT: This is a long string that is the concatenation of two shorter strings.

        // 55 is being added to a string, so it is converted to a string
        // and then they are concatinated. The resultant string is
        // then concatinated with the next string.
        System.out.println("The first computer was invented about " + 55
                + " years ago.");
        // OUTPUT: The first computer was invented about 55 years ago.

        // 8 is being added to a string, so it is converted to a string
        // and then they are concatinated. Then 5 is being added to the
        // resultant string, so is converted to a string and then they are
        // concatinated.
        System.out.println("8 plus 5 is " + 8 + 5);
        // OUTPUT: 8 plus 5 is 85

        // The operations in parentheses are evaluated first, so 8 is added to
        // 5 first. They are both numbers, so the result is their total. Then
        // that total is added to a string, so is converted to a string and
        // then they are concatinated together.
        System.out.println("8 plus 5 is " + (8 + 5));
        // OUTPUT: 8 plus 5 is 13

        // The leftmost operation is evaluated first, so 8 is added to 5 first.
        // They are both numbers, so the result is their total. Then that total
        // is added to a string, so is converted to a string and then they are
        // concatinated together.
        System.out.println(8 + 5 + " equals 8 plus 5.");
        // OUTPUT: 13 equals 8 plus 5.
    }
}
