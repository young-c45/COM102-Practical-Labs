/*
 * Class created by Callum Young
 * Created: 15 Feb 2022
 * Last Updated: 15 Feb 2022
 */
package uk.ac.ulster.b00834218.grades;

// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades {

    public static void main(String[] args) {
        // Creates 1st student as Mary
        Student student1 = new Student("Mary");
        // Creates 2nd student as Mike
        Student student2 = new Student("Mike");

        // Gets the grades for student 1
        student1.inputGrades();
        // Outputs the average grade for student 1
        System.out.println("The average for " + student1.getName() + " is " + student1.getAverage());

        // Outputs an empty line for better formating
        System.out.println();

        // Gets the grades for student 2
        student2.inputGrades();
        // Outputs the average grade for student 2
        System.out.println("The average for " + student2.getName() + " is " + student2.getAverage());

        // Outputs an empty line for better formating
        System.out.println();

        // Outputs the variables for student 1
        System.out.println("Student 1: " + student1);
        // Outputs the variables for student 2
        System.out.println("Student 2: " + student2);
    }
}
