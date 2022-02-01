/*
 * Class created by Callum Young
 * Created: 25 Jan 2022
 * Last Updated: 25 Jan 2022
 */

package uk.ac.ulster.b00834218.gradetable;

public class GradeTable {
    // Runs first when GradeTable class is called
    public static void main(String[] args) {
        // Sets the info for the students
        // [name, lab, bonus]
        String students [] [] = {
            {"Derek", "35", "10"},
            {"Rohin", "20", "3"},
            {"Tom", "42", "2"},
            {"Sammuel", "23", "5"},
            {"Linus", "48", "1"}
        };
        
        // Displays the formating for the table
        System.out.println("///////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==      Student Points      ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////");
        System.out.println("Name\tLab\tBonus\tTotal");
        System.out.println("----\t---\t-----\t-----");
        // Runs for each student
        for(int i = 0; i < students.length; i++) {
            // Runs for all the data for the student
            for(int j = 0; j < students[i].length; j++) {
                // Adds the data to the table
                System.out.print(students[i][j] + "\t");
            }
            // Prints the total and goes to the next line
            System.out.println(Integer.parseInt(students[i][1]) + Integer.parseInt(students[i][2]));
        }
    }
}
