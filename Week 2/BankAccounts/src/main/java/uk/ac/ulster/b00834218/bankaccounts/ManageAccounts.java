/*
 * Class created by Callum Young
 * Created: 1 Feb 2022
 * Last Updated: 1 Feb 2022
 */
package uk.ac.ulster.b00834218.bankaccounts;

public class ManageAccounts {

    // Runs first when ManageAccounts class is called
    public static void main(String[] args) {
        // Declares the new account Variables
        Account acct1, acct2;
        
        // Creates account 1
        acct1 = new Account(1000, "Sally", 1111);
        // Creates account 2
        acct2 = new Account(500, "Joe", 999);
        
        // Deposits $100 into account 2
        acct2.deposit(100);
        // Charges fee to account 2 and outputs the new balance
        System.out.println("Account 2's Balance: $" + acct2.chargeFee());
        
        // Withdraws $50 from account 1
        acct1.withdraw(50);
        // Charges fee to account 1 and outputs the new balance
        System.out.println("Account 1's Balance: $" + acct1.chargeFee());
        
        // Changes account 2's owner name to Joseph
        acct2.changeName("Joseph");
        
        
        // Outputs an empty line for better formating
        System.out.println();
        // Outputs a summary for account 1
        System.out.println(acct1.toString());
        
        // Outputs an empty line for better formating
        System.out.println();
        // Outputs a summary for account 2
        System.out.println(acct2.toString());
    }
    
}
