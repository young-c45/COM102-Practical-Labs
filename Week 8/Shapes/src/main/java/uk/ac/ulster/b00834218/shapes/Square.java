/*
 * Class created by Callum Young
 * Created: 16 Mar 2022
 * Last Updated: 16 Mar 2022
 */
package uk.ac.ulster.b00834218.shapes;

public class Square extends Shape {

    // Declares the class variables
    private static int shapeCount = 1;

    // Creates the object
    public Square(double sideLength) {
        super("Square" + Square.shapeCount++, sideLength * sideLength);
    }

    // Sets the area
    public void setArea(double sideLength) {
        super.setArea(sideLength * sideLength);
    }

    // Gets the area input type
    public String getAreaInputType() {
        return "side length";
    }

}
