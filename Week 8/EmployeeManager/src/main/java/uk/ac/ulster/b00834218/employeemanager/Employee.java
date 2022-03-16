/*
 * Class created by Callum Young
 * Created: 16 Mar 2022
 * Last Updated: 16 Mar 2022
 */
package uk.ac.ulster.b00834218.employeemanager;

abstract public class Employee {

    // Declares the parent's instance variables
    protected String id;
    protected double wage;

    // Called to create the object
    public Employee(String newId, double newWage) {
        // Sets the parent's instance variables
        this.id = newId;
        this.wage = newWage;
    }

    // The method to calculate the payment for work over a period of time
    public double getPayment(double time) {
        return 0;
    }

}
