/*
 * Class created by Callum Young
 * Created: 16 Mar 2022
 * Last Updated: 16 Mar 2022
 */
package uk.ac.ulster.b00834218.shapes;

import java.util.Scanner;

public class Shapes {

    // Runs first when Shapes class is called
    public static void main(String[] args) {
        // Creates the scanner for input
        Scanner input = new Scanner(System.in);

        // Creates the shapes
        Shape[] shapes = {
            new Shape("Triangle1", 100.5),
            new Shape("Hexagon1", 420.69),
            new Square(2),
            new Square(10),
            new Circle(5)
        };

        // Runs for each shape
        for (int i = 0; i < shapes.length; i++) {
            // Displays the shapes info
            System.out.println(shapes[i]);
        }

        // Runs for every other object
        for (int i = 0; i < shapes.length; i += 2) {
            // Asks the user to change the area of the object
            System.out.println("Please enter the new "
                    + shapes[i].getAreaInputType() + " for "
                    + shapes[i].getShapeID());
            // Changes the area
            shapes[i].setArea(input.nextDouble());
            // Goes to the next input line
            input.nextLine();
        }

        // Runs for each shape
        for (int i = 0; i < shapes.length; i++) {
            // Displays the shapes info
            System.out.println(shapes[i]);
        }

    }

}
