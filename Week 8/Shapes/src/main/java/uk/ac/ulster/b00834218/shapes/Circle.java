/*
 * Class created by Callum Young
 * Created: 16 Mar 2022
 * Last Updated: 16 Mar 2022
 */
package uk.ac.ulster.b00834218.shapes;

public class Circle extends Shape {

    // Declares the class variables
    private static int shapeCount = 1;

    // Creates the object
    public Circle(double radius) {
        super("Circle" + Circle.shapeCount++, Math.PI * radius * radius);
    }

    // Sets the area
    public void setArea(double radius) {
        super.setArea(Math.PI * radius * radius);
    }

    // Gets the area input type
    public String getAreaInputType() {
        return "radius";
    }

}
