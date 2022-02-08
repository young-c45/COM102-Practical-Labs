/*
 * Class created by Callum Young
 * Created: 8 Feb 2022
 * Last Updated: 8 Feb 2022
 */
package uk.ac.ulster.b00834218.rock;

// Imports needed libraries
import java.util.*;

public class Rock {

    // Declares the needed variables
    private String personPlay, computerPlay;
    private Scanner scan;
    private Random rand;

    // Runs first when Rock class is called
    public static void main(String[] args) {
        // Declares new rock object
        Rock game = new Rock();
        
        // Runs the game
        game.playGame();
    }

    // Runs the logic for playing the game
    public void playGame() {
        // Declares the needed local variables
        boolean playing = true;
        String input;
        
        // Outputs that a game is being played
        System.out.println("Playing game of rock, paper, scissors");
        
        // Runs while the player wants to play
        do {
            // Gets the persons play
            personPlay = getUserPlay();
            // Gets the computers play
            computerPlay = getComputerPlay();
            
            // Returns if the computer play is invalid
            if (computerPlay.equals("I")) return;
            
            // Outputs and empty line for better formating
            System.out.println();
            
            // Changes output based on players play
            if (personPlay.equals("R")) {
                // Outputs the players play
                System.out.println("Player chose rock.");
                
                // Changes output based on computers play
                if (computerPlay.equals("R")){
                    // Outputs the computer's play
                    System.out.println("Computer chose rock.");
                    
                    // Outputs the result
                    System.out.println("It's a tie!");
                } else if (computerPlay.equals("P")){
                    // Outputs the computer's play
                    System.out.println("Computer chose paper.");
                    
                    // Outputs the result
                    System.out.println("Rock vs Paper: computer wins!");
                } else if (computerPlay.equals("S")){
                    // Outputs the computer's play
                    System.out.println("Computer chose scissors.");
                    
                    // Outputs the result
                    System.out.println("Rock vs Scissors: player wins!");
                } 
            } else if (personPlay.equals("P")) {
                // Outputs the players play
                System.out.println("Player chose paper.");
                
                // Changes output based on computers play
                if (computerPlay.equals("R")){
                    // Outputs the computer's play
                    System.out.println("Computer chose rock.");
                    
                    // Outputs the result
                    System.out.println("Paper vs Rock: player wins!");
                } else if (computerPlay.equals("P")){
                    // Outputs the computer's play
                    System.out.println("Computer chose paper.");
                    
                    // Outputs the result
                    System.out.println("It's a tie!");
                } else if (computerPlay.equals("S")){
                    // Outputs the computer's play
                    System.out.println("Computer chose scissors.");
                    
                    // Outputs the result
                    System.out.println("Paper vs Scissors: computer wins!");
                } 
            } else if (personPlay.equals("S")) {
                // Outputs the players play
                System.out.println("Player chose scissors.");
                
                // Changes output based on computers play
                if (computerPlay.equals("R")){
                    // Outputs the computer's play
                    System.out.println("Computer chose rock.");
                    
                    // Outputs the result
                    System.out.println("Scissors vs Rock: computer wins!");
                } else if (computerPlay.equals("P")){
                    // Outputs the computer's play
                    System.out.println("Computer chose paper.");
                    
                    // Outputs the result
                    System.out.println("Scissors vs Paper: player wins!");
                } else if (computerPlay.equals("S")){
                    // Outputs the computer's play
                    System.out.println("Computer chose scissors.");
                    
                    // Outputs the result
                    System.out.println("It's a tie!");
                } 
            }
            
            // Gets if the user wants to play again
            System.out.println("Would you like to play again? (Y for yes)");
            input = scan.next().toUpperCase();
            
            // Stops playing if input is not Y
            if (!input.equals("Y")) playing = false;
            
            // Outputs an empty line for better formating
            System.out.println();
        } while (playing);
        
        System.out.println("Goodbye!");
    }

    // Gets the user's play
    public String getUserPlay() {
        // Declares the needed local variables
        boolean invalid = true;
        String input = "";
        
        // Creates the Scanner object
        scan = new Scanner(System.in);

        // Runs until the input is valid
        do {
            // Outputs an empty line for better formating
            System.out.println();
            
            // Gets the user to input their play
            System.out.println("What do you want to play? (R, P, or S)");
            input = scan.next().toUpperCase();
            
            // Runs if the play is valid
            if (input.equals("R") || input.equals("P") || input.equals("S")) {
                // Tells the program the input is valid
                invalid = false;
            } else {
                // Tells the user the input is invalid
                System.out.println("Invalid Input: Please enter 'R' for rock, "
                        + "'P' for paper, or 'S' for scissors.");
            }
        } while (invalid);
        
        // Returns the play
        return input;
    }
    
    public String getComputerPlay() {
        // Declares the needed local variables
        boolean invalid = true;
        String play = "";
        int playNum;
        
        // Creates the Random object
        rand = new Random();
        
        // Gets a random number for the play
        playNum = rand.nextInt(3);
        
        // Gets the play from the play number
        switch (playNum) {
            case 0:
                play = "R";
                break;
            case 1:
                play = "P";
                break;
            case 2:
                play = "S";
                break;
            // Runs if the play is invalid (shouldn't ever run)
            default:
                play = "I";
                System.out.println("Warning; Invalid computer play");
        }
        
        // Returns the play
        return play;
    }
}
