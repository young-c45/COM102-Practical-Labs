/*
 * Class created by Callum Young
 * Created: 1 Feb 2022
 * Last Updated: 1 Feb 2022
 */
package uk.ac.ulster.b00834218.bankaccounts;

public class Account {

    // Creates the object variables
    private double balance;
    private String name;
    private long acctNum;
    private static double serviceFee = 10;

    // Runs when the object is first created
    Account(double initBal, String owner, long number) {
        // Sets the variables using the arguments provided
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    // Withdraws money from account if balance is sufficient 
    public void withdraw(double amount) {
        // Runs if the balance is sufficient
        if (balance >= amount) {
            // Removes the amount from the balance
            balance -= amount;
            // Runs if the balance is insufficient
        } else {
            // Tells the user there is insufficient funds
            System.out.println("Insufficient funds");
        }
    }

    // Deposits money into the account
    public void deposit(double amount) {
        // Adds the amount to the balance
        balance += amount;
    }

    // Gets the balance of the account
    public double getBalance() {
        // Returns the current balance
        return balance;
    }

    // Converts the account info to a string
    public String toString() {
        // Creates a string with the account information
        String acctString = "Account Number: " + acctNum + "\n"
                + "Owner Name: " + name + "\n"
                + "Current Balance: " + balance;
        // Returns the string
        return acctString;
    }

    // Charges the service fee and returns the updated balance
    public double chargeFee() {
        // Deducts the service fee from the balance
        balance -= serviceFee;
        // Returns the new balance
        return balance;
    }

    // Changes the name of the owner associated with the account
    public void changeName(String newName) {
        // Sets the new account name
        name = newName;
    }

}
