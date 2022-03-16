/*
 * Class created by Callum Young
 * Created: 16 Mar 2022
 * Last Updated: 16 Mar 2022
 */
package uk.ac.ulster.b00834218.employeemanager;

public class PartTime extends Employee {

    // Creates the object
    public PartTime(String newId, double newWage) {
        // Calls the parent constructor
        super(newId, newWage);
    }

    // Calculates the payment to be made for time hours of work
    public double getPayment(double time) {
        double payment = super.wage * time;
        payment = Math.round(payment * 100.0) / 100.0;
        return payment;
    }

}
