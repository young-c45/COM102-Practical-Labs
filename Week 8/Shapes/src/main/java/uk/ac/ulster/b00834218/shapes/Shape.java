/*
 * Class created by Callum Young
 * Created: 16 Mar 2022
 * Last Updated: 16 Mar 2022
 */
package uk.ac.ulster.b00834218.shapes;

public class Shape {

    // Declares the instance variables
    private String shapeID;
    private double area;

    // Creates the object
    public Shape(String id, double newArea) {
        // Sets the instance variables
        this.shapeID = id;
        this.area = newArea;
    }

    // Gets the shape ID
    public String getShapeID() {
        return this.shapeID;
    }

    // Sets the shape ID
    public void setShapeID(String ID) {
        this.shapeID = ID;
    }

    // Gets the area
    public double getArea() {
        return area;
    }

    // Sets the area
    public void setArea(double newArea) {
        this.area = newArea;
    }

    // Gets the area input type
    public String getAreaInputType() {
        return "area";
    }

    // Returns shape info as a string
    public String toString() {
        return this.shapeID + " area: "
                + String.format("%.2f", this.area);
    }

}
