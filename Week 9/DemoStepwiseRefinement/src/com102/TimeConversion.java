/*
 * The program is used to demonstrate how to use stepwise refinement
 * to break down a programming problem into a series of steps
 *
 * @author COM102
 * Version v1.0
 */
package com102;

public class TimeConversion {

    /* Accept an integer as input and return a 2-character
       string representation with a leading "0" if necessary
     */
    private String char2(int val) {
        return (val < 10 ? "0" + val : "" + val);
    }

    /* Accept a time in 24-hour format as hh:mm
       and return the equivalent in 12-hour AM/PM format
     */
    public String toAMPM(String t24) {

        if (!validInput(t24)) {
            return "ERROR";
        }

        /* Step 1
           Get the hh and mm values from the input
         */
        int positionOfColon = t24.indexOf(":");
        int hours = Integer.parseInt(t24.substring(0, positionOfColon));
        String minutes = t24.substring(positionOfColon + 1);

        /* Step 2
           Change the hh value and store either AM or PM in the ampm variable
         */
        String ampm = (hours >= 12 ? "PM" : "AM");
        hours = (hours % 12 == 0) ? 12 : hours % 12;

        /* Step 3
           Build the output string from HH, MM and ampm values and return it
         */
        return char2(hours) + ":" + minutes + " " + ampm;

    }

    /* CHALLENGE
       Include error reporting if an invalid input is provided
     */
    private boolean validInput(String t24) {

        //Overall length from only be 4 (1:23) or 5 (12:34)
        if (t24.length() < 4 || t24.length() > 5) {
            return false;
        }

        //Colon can only be in position 1 or 2
        int positionOfColon = t24.indexOf(":");
        if (positionOfColon < 1 || positionOfColon > 2) {
            return false;
        }

        // Makes sure that every character appart from the colon is a digit
        for (int i = 0; i < t24.length(); i++) {
            if (i != positionOfColon && !Character.isDigit(t24.charAt(i))) {
                return false;
            }
        }

        //We know that the string is the correct "shape" and that the hours and minutes parts are numeric
        //so we need to perform value range checking
        if (Integer.parseInt(t24.substring(0, positionOfColon)) > 23) {
            return false;
        } else if (Integer.parseInt(t24.substring(positionOfColon + 1)) > 59) {
            return false;
        }

        return true;
    }
}
