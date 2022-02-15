/*
 * Class created by Callum Young
 * Created: 15 Feb 2022
 * Last Updated: 15 Feb 2022
 */
package uk.ac.ulster.b00834218.person;

// ****************************************************************
// Person.java
//
// A simple class representing a person.
// ***************************************************************
public class Person {

    private String name;
    private int age;

    //----------------------------------------------------
    //Set up a Person object with the given name and age
    //----------------------------------------------------
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ------------------------------------------------------------
    // Changes the name of the Student to the parameter newName.
    // ------------------------------------------------------------
    public void setName(String newName) {
        name = newName;
    }

    // -----------------------------------------------------------
    // Changes the age of the Student to the parameter newAge.
    // -----------------------------------------------------------
    public void setAge(int newAge) {
        age = newAge;
    }

    // -----------------------------------------------------------
    // Returns the student's name and age as a string.
    // -----------------------------------------------------------
    public String toString() {
        return name + " - Age " + age;
    }

}
