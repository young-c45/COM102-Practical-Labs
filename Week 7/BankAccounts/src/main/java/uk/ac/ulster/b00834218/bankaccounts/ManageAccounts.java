/*
 * Class created by Callum Young
 * Created: 1 Feb 2022
 * Last Updated: 1 Feb 2022
 */
package uk.ac.ulster.b00834218.bankaccounts;

// Imports java.util
import java.util.*;

public class ManageAccounts {

    // Declares the array to store 3 account objects
    private static Account[] accounts = new Account[3];
    // Declares the object to store the scanner
    private static Scanner scan;

    // Runs first when ManageAccounts class is called
    public static void main(String[] args) {
        // Declares the local variables
        double initBal;
        String owner;
        long acctNum;
        Account retrievedAccount = null;

        // Creates the scanner object
        scan = new Scanner(System.in);

        // Runs for each element in the accounts array
        for (int i = 0; i < accounts.length; i++) {
            // Trys to get the account number
            try {
                // Asks for the user to input the account number
                System.out.println("Please enter the account number "
                        + "for account " + i + ": ");
                // Gets the account number from the user
                acctNum = scan.nextLong();
            } // Cataches input not long
            catch (InputMismatchException e) {
                // Tells the user the input doesn't work
                System.out.println("That is not a valid long, "
                        + "using 0 instead.");
                // Sets the balance to 0
                acctNum = 0;
            } finally {
                // Advances past the current line to prepare for the next input
                scan.nextLine();
            }

            // Asks the user for the account owner name
            System.out.println("Please enter the account owner name "
                    + "for account " + i + ": ");
            // Gets the account owner name
            owner = scan.nextLine();

            // Trys to get the initial balance
            try {
                // Asks the user to input the balance
                System.out.println("Please enter the starting balance "
                        + "for account " + i + ":");
                // Gets the balance from the user
                initBal = scan.nextDouble();
            } // Catches input not double
            catch (InputMismatchException e) {
                // Tells the user the input doesn't work
                System.out.println("That is not a valid double, "
                        + "using 0 instead.");
                // Sets the balance to 0
                initBal = 0;
            } finally {
                // Advances past the current line to prepare for the next input
                scan.nextLine();
            }

            // Creates the account object using those values
            accounts[i] = new Account(initBal, owner, acctNum);

            // Outputs an empty line for better formating
            System.out.println();
        }

        // Trys to get the account number from the user
        try {
            // Asks the user to input an account numer
            System.out.println("Please enter the account number of the "
                    + "balance you wish to view:");
            // Gets the account number from the user
            acctNum = scan.nextLong();
        } // Cataches input not long
        catch (InputMismatchException e) {
            // Tells the user the account number is invalid
            System.out.println("Account number needs to be of type long.");
            // Exits the main method
            return;
        } finally {
            // Advances past the current line to prepare for the next input
            scan.nextLine();
        }

        // Runs for each account in the accounts array
        for (Account account : accounts) {
            // Runs if the account number is correct
            if (account.getNumber() == acctNum) {
                // Copies the account referance to retrievedAccount
                retrievedAccount = account;
            }
        }

        // Runs if the account was not found
        if (retrievedAccount == null) {
            // Tells the user the account could not be found
            System.out.println("Could not find an account with account number "
                    + acctNum + ".");
        } // Runs of the account was found
        else {
            // Tells the user the account balance
            System.out.println("Account number " + acctNum + " has a balance "
                    + "of " + retrievedAccount.getBalance() + ".");
        }
    }

}
