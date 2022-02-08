/*
 * Class created by Callum Young
 * Created: 8 Feb 2022
 * Last Updated: 8 Feb 2022
 */
package uk.ac.ulster.b00834218.palindromecheck;

// Imports needed libraries
import java.util.*;

public class PalindromeCheck {
    
    // Runs first when PalindromeCheck class is called
    public static void main(String[] args) {
        // Declares the needed variables
        String input;
        // Creates the needed objects
        Scanner scan = new Scanner(System.in);
        PalindromeCheck palindrome = new PalindromeCheck();
        
        // Gets the user to input a word
        System.out.println("What word do you want to check?");
        input = scan.next();
        
        // Tells the user if the word is or is not a palindrome
        if (palindrome.isPalindrome(input)) {
            System.out.println("True, the word " + input + " is a palindrome.");
        } else {
            System.out.println("False, the word " + input + " is NOT a palindrome.");
        }
        
    }
    
    // Returns true if the provided string is a palindrome
    public boolean isPalindrome(String word) {
        // Declares the required local variables
        boolean answer = false;
        String reversedWord = "";
        
        // Converts the word to all lower case
        word = word.toLowerCase();
        
        // Runs for each letter in the word
        for (char c : word.toCharArray()) {
            // Adds the letter to the begining of the reversed word
            reversedWord = c + reversedWord;
        }
        
        // Sets the answer to true if the word is the same reversed
        if (word.equals(reversedWord)) answer = true;
        
        // Returns the answer
        return answer;
    }

}
