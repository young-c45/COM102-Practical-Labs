/*
 * This an application class used to demonstrate stepwise techniques
 *
 * @author COM102
 */
package com102;

public class Week9Demo
{

    public static void main(String[] args)
    {
        TimeConversion demo = new TimeConversion();
        
        System.out.println("Testing toAMPM...");
        System.out.println(demo.toAMPM("12:15"));
        System.out.println(demo.toAMPM("17:35"));
        System.out.println(demo.toAMPM("0:10"));
        System.out.println(demo.toAMPM("03:30"));
        System.out.println(demo.toAMPM("120:15"));
        System.out.println(demo.toAMPM(":35"));
        System.out.println(demo.toAMPM("1x:10"));
        System.out.println(demo.toAMPM("03:3y"));
        System.out.println(demo.toAMPM("24:15"));
        System.out.println(demo.toAMPM("17:75"));
       
    }
    
}
