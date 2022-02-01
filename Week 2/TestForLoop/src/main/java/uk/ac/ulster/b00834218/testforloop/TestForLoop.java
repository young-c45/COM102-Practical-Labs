/*
 * Class created by Callum Young
 * Created: 1 Feb 2022
 * Last Updated: 1 Feb 2022
 */
package uk.ac.ulster.b00834218.testforloop;

public class TestForLoop {

    public static void main(String[] args) {
        // Creates the array for student names
        String[] studentName = {"John", "Mary", "Stephen", "James",
            "Amy", "Fiona"};
        // Creates the array for student marks
        int[] studentMarks = {90, 56, 70, 66, 81, 96};

        // Creates variables to store info on the highest mark
        int highestMark = -1;
        String highestMarkStudent = "None";

        // Runs for every student
        for (int i = studentName.length - 1; i >= 0; i--) {
            // Outputs the student information
            System.out.println("Student = " + studentName[i]
                    + ", their mark = " + studentMarks[i]);

            // Runs if the student has the current highest mark
            if (studentMarks[i] > highestMark) {
                // Sets the highest mark info to the student
                highestMark = studentMarks[i];
                highestMarkStudent = studentName[i];
            }
        }
        
        // Outputs a line for better formating
        System.out.println();
        // Outputs the highest mark information
        System.out.println("Highest mark = " + highestMark +
                ", student with that mark = " + highestMarkStudent);
    }
}
