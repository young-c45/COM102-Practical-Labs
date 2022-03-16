/*
 * Class created by Callum Young
 * Created: 16 Mar 2022
 * Last Updated: 16 Mar 2022
 */
package uk.ac.ulster.b00834218.employeemanager;

import java.util.Scanner;

public class EmployeeManager {

    // Runs first when EmployeeManager class is called
    public static void main(String[] args) {
        // Declares the local variables
        String id;
        double wage, time, payment;
        // Declares the employee objects
        FullTime fullTime;
        PartTime partTime;

        // Creates the scanner for user input
        Scanner scan = new Scanner(System.in);

        // Asks the user for the full timer id
        System.out.println("What is the ID of the full time employee?");
        // Gets the ID
        id = scan.nextLine();

        // Asks the user for the full timer wage
        System.out.println("What is the annual salary of the full time "
                + "employee?");
        // Gets the wage
        wage = scan.nextDouble();
        // Puts scan to the next line
        scan.nextLine();

        // Creates the full time employee object
        fullTime = new FullTime(id, wage);

        // Asks the user for the part timer id
        System.out.println("What is the ID of the part time employee?");
        // Gets the ID
        id = scan.nextLine();

        // Asks the user for the part timer wage
        System.out.println("What is the hourly salary of the part time "
                + "employee?");
        // Gets the wage
        wage = scan.nextDouble();
        // Puts scan to the next line
        scan.nextLine();

        // Creates the full time employee object
        partTime = new PartTime(id, wage);

        // Asks the user for the amount of months to pay the full time worker
        System.out.println("How many months should the full time employee "
                + "be payed for?");
        // Gets the amount of time
        time = scan.nextDouble();
        // Gets the payment amount
        payment = fullTime.getPayment(time);
        // Outputs the payment amount
        System.out.println("The employee will have to be payed £" + payment
                + " for " + time + " months of work.");

        // Asks the user for the amount of months to pay the full time worker
        System.out.println("How many hours should the part time employee "
                + "be payed for?");
        // Gets the amount of time
        time = scan.nextDouble();
        // Gets the payment amount
        payment = partTime.getPayment(time);
        // Outputs the payment amount
        System.out.println("The employee will have to be payed £" + payment
                + " for " + time + " hours of work.");
    }

}
