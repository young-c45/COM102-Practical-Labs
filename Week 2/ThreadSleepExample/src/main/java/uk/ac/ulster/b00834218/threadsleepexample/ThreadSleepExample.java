/*
 * Class created by Callum Young
 * Created: 1 Feb 2022
 * Last Updated: 1 Feb 2022
 */

package uk.ac.ulster.b00834218.threadsleepexample;

/*
 * This class will run forever. This is because b is stored as a byte, which
 * can only store -128 to 127. When b is 127 and is incremented, it overflows
 * and becomes -128. -128 is less than 128, so the loop will continue to run.
 * Because a byte can never be more than 128, the loop will never stop.
 */
public class ThreadSleepExample {
    // Runs first when ThreadSleepExample class is called
    public static void main(String[] args) throws InterruptedException {
        // Runs for b values of 0 to 128
        for(byte b = 0; b <= 128; b += 1) {
            // Outputs the value of b to the console
            System.out.println(b);
            // Waits 30ms
            Thread.sleep(30);
        }
    }
}
