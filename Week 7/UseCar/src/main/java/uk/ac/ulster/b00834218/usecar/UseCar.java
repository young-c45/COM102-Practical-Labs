/*
 * Class created by Callum Young
 * Created: 8 Mar 2022
 * Last Updated: 8 Mar 2022
 */
package uk.ac.ulster.b00834218.usecar;

import java.util.*;
import java.io.*;

public class UseCar {

    // Declares the array to hold the cars
    private static Car[] cars = new Car[3];
    // Declatres the scanner object
    private static Scanner scan;

    // Runs first when UseCar class is called
    public static void main(String[] args) {
        // Creates a car from the user's input
        cars[0] = createUserInputCar();

        // Trys to read car_data.text
        try {
            // Creates a new scanner to read from car_data.txt
            scan = new Scanner(new File("car_data.txt"));

            // Creates a new car with the scanner
            cars[1] = createScannerCar();

            // Creates an empty car object
            cars[2] = new Car();
            // Adds info from file to cars[2]
            modifyScannerCar(cars[2]);
        } // Catches if the file is not found
        catch (FileNotFoundException e) {
            // Tells the user the file could not be found
            System.out.println("Could not find car_data.txt");
            // Exits the main method
            return;
        } finally {
            // Closes the file
            scan.close();
        }

        // Runs for each car
        for (Car car : cars) {
            // Outputs an empty line for better formating
            System.out.println();
            // Outputs the car's details
            car.displayDetails();
        }

        // Stores the cars in a file
        storeCars();
    }

    // Creates a car from the user input
    private static Car createUserInputCar() {
        // Declares the local variables
        String model;
        int engSize = 1000, inSize, year = Car.getCurrentYear();
        double newPrice = 0;

        // Creates the scanner object for user input
        scan = new Scanner(System.in);

        // Asks the user for the cars model
        System.out.println("Please enter the car's model: ");
        // Gets the car's model
        model = scan.nextLine();

        // Trys to get the car's manufacturing year
        try {
            // Asks the user to enter the car's manufacturing year
            System.out.println("Please enter the year of manufacture: ");
            // Gets the manufacture year
            year = scan.nextInt();
        } // Cataches incorrect input type exception
        catch (InputMismatchException e) {
            // Tells the user the input is invalid
            System.out.println("Invalid year of manufacture, "
                    + "must be of type int.");
        } finally {
            // Advances past the current line to prepare for the next input
            scan.nextLine();
        }

        // Trys to get the car's engine capacity
        try {
            // Asks the user for the car's engine capacity
            System.out.println("Please enter the engine capacity in ml: ");
            // Gets the engine capacity
            inSize = scan.nextInt();

            // Runs if the inSize is too small
            if (inSize < 1000) {
                // Tells the user the input is too small
                System.out.println("Engine capacity to small; "
                        + "must be between 1000 and 3000");
            } // Runs if the inSize is too large
            else if (inSize > 3000) {
                // Tells the user the input is too large
                System.out.println("Engine capacity to big; "
                        + "must be between 1000 and 3000");
            } // Runs if the inSize is within range
            else {
                engSize = inSize;
            }
        } // Cataches incorrect input type exception
        catch (InputMismatchException e) {
            // Tells the user the input is invalid
            System.out.println("Invalid engine capacity, "
                    + "must be of type int.");
        } finally {
            // Advances past the current line to prepare for the next input
            scan.nextLine();
        }

        // Trys to get the car's price when new
        try {
            // Asks the user for the cars price when new
            System.out.println("Please enter the price of the car when new:");
            // Gets the price of the car
            newPrice = scan.nextDouble();
        } // Cataches incorrect input type exception
        catch (InputMismatchException e) {
            // Tells the user the input is invalid
            System.out.println("Invalid price, "
                    + "must be of type double.");
        } finally {
            // Advances past the current line to prepare for the next input
            scan.nextLine();
        }

        // Returns the car object
        return new Car(model, engSize, year, newPrice);
    }

    // Creates a car from the current scanner stream
    private static Car createScannerCar() {
        // Declares the local variables
        String model;
        int year;
        double engSize, newPrice;

        // Gets the car info
        model = scan.next();
        engSize = scan.nextDouble();
        year = scan.nextInt();
        newPrice = scan.nextDouble();
        // Goes to the next line to prepare scan to read again
        scan.nextLine();

        // Returns the car object
        return new Car(model, engSize, year, newPrice);
    }

    // Modifies a car by reading from the scanner stream
    private static void modifyScannerCar(Car car) {
        // Sets the car's info
        car.setModel(scan.next());
        car.setEngSize((int) Math.round(scan.nextDouble() * 1000));
        car.setYear(scan.nextInt());
        car.setNewPrice(scan.nextDouble());
        // Goes to the next line to prepare scan to read again
        scan.nextLine();
    }

    // Writes the cars to a text file
    private static void storeCars() {
        // Declares the variable to store the print writer
        PrintWriter output;
        // Declares the file to store the info in
        File outputFile = new File("CarDetails.txt");

        // Trys to output to the file
        try {
            // Creates the file if it doesn't exist
            outputFile.createNewFile();

            // Opens the file with a print writer
            output = new PrintWriter(new FileWriter(outputFile, true));

            // Run for each car in cars
            for (Car car : cars) {
                // Outputs the car's information to the file
                output.println(car);
            }

            output.close();
        } // Catches any excetion
        catch (Exception e) {
            System.out.println("Error encountered when wrighting to file: "
                    + e.getLocalizedMessage());
        }
    }

}
