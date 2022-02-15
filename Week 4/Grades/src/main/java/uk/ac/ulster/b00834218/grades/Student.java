/*
 * Class created by Callum Young
 * Created: 15 Feb 2022
 * Last Updated: 15 Feb 2022
 */
package uk.ac.ulster.b00834218.grades;

// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and print student's name.
// ****************************************************************
import java.util.Scanner;

public class Student {

    //declare instance data
    private String name;
    private int test1;
    private int test2;

    //----------------------------------------------------
    //constructor
    //----------------------------------------------------
    public Student(String studentName) {
        // Sets the students name
        this.name = studentName;
        // Initialised the student's scores to 0
        test1 = 0;
        test2 = 0;
    }

    //----------------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //----------------------------------------------------
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + name + "'s score for test 1: ");
        test1 = scan.nextInt();

        System.out.println("Enter " + name + "'s score for test 2: ");
        test2 = scan.nextInt();
    }

    //----------------------------------------------------
    //getAverage: compute and return the student's test average
    //----------------------------------------------------
    public int getAverage() {
        // Returns the average score for the student
        return (test1 + test2) / 2;
    }

    //----------------------------------------------------
    //getName: returns the student's name
    //----------------------------------------------------
    public String getName() {
        // Returns the students name
        return name;
    }

    //----------------------------------------------------
    //toString: returns the student's information as a string
    //----------------------------------------------------
    public String toString() {
        // Returns the info
        return "Name: " + name + "\tTest1: " + test1 + "\tTest2: " + test2;
    }

}
