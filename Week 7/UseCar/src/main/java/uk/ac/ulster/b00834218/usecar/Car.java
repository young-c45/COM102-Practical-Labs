/*
 * Class created by Callum Young
 * Created: 8 Mar 2022
 * Last Updated: 8 Mar 2022
 */
package uk.ac.ulster.b00834218.usecar;

public class Car {

    // Declares the class variables
    private static final int CURRENT_YEAR = 2011;
    private static int totalNum = 0;

    // Declares the instance variables
    private String model;
    private int engSize;
    private int year;
    private double newPrice;

    // Creates a new car object, setting all the variables
    public Car(String inModel, int inEngSize, int inYear, double inNewPrice) {
        // Sets the instance variables
        this.model = inModel;
        this.engSize = inEngSize;
        this.year = inYear;
        this.newPrice = inNewPrice;
        // Adds the car to the total number of cars
        Car.totalNum++;
    }

    // Creates a new car object, taking the engine size as litres
    public Car(String inModel, double inEngSize, int inYear, double inNewPrice) {
        // Sets the instance variables
        this.model = inModel;
        this.engSize = (int) Math.round(inEngSize * 1000);
        this.year = inYear;
        this.newPrice = inNewPrice;
        // Adds the car to the total number of cars
        Car.totalNum++;
    }

    // Creates a new car object with not information
    public Car() {
        Car.totalNum++;
    }

    // Calculates and returns the annual road tax of the car
    private double roadTax() {
        // Returns a different tax depending on the engine capacity
        if (this.engSize <= 1200) {
            return 100;
        } else if (this.engSize <= 2000) {
            return 150;
        } else {
            return 200;
        }
    }

    // Returns the value of the car in current year
    private double currentValue() {
        // Stores the car's age
        int age = Car.CURRENT_YEAR - this.year;
        // Declares the variable to store the car's value
        double value = this.newPrice;

        // Runs if the car is not new
        if (age > 0) {
            // Removes 20% of the value for the first year
            value *= 0.8;
            // Removes the first year so it is not double counted
            age--;
        }

        // Runs until every year has been counted
        while (age > 0) {
            // Removes 10% of the value for the year
            value *= 0.9;
            // Removes the year so it will not be counted again
            age--;
        }

        // Returns the value
        return value;
    }

    // Displays information about the car
    public void displayDetails() {
        // Outputs the car's information
        System.out.println("Car model: " + this.model);
        System.out.println("Year of manufacture: " + this.year);
        System.out.println("Engine capacity: " + this.engSize);
        System.out.println("Annual road tax: " + this.roadTax());
        System.out.println("Current value: " + this.currentValue());
    }

    // Returns all the info about the car in a string
    public String toString() {
        // Declares the local variables
        String output = "";

        // Adds the info to the string
        output += this.model + " ";
        output += this.engSize + " ";
        output += this.year + " ";
        output += this.newPrice + " ";
        output += Car.totalNum;

        // Returns the output string
        return output;
    }

    // Returns the car's model
    public String getModel() {
        return this.model;
    }

    // Changes the car's model
    public void setModel(String inModel) {
        this.model = inModel;
    }

    // Returns the car's engine size
    public int getEngSize() {
        return this.engSize;
    }

    // Changes the car's engine size
    public void setEngSize(int inEngSize) {
        this.engSize = inEngSize;
    }

    // Returns the year the car was made
    public int getYear() {
        return this.year;
    }

    // Changes the year the car was made
    public void setYear(int inYear) {
        this.year = inYear;
    }

    // Returns the price when new
    public double getNewPrice() {
        return this.newPrice;
    }

    // Changes the price when new
    public void setNewPrice(double inNewPrice) {
        this.newPrice = inNewPrice;
    }

    // Returns the total number of cars
    public static int getTotalNum() {
        return Car.totalNum;
    }

    // Returns the current year
    public static int getCurrentYear() {
        return Car.CURRENT_YEAR;
    }

}
