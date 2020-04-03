/*
Lisa Hanna
31 March, 2020
Step 3 of Lab4 -- Program that generates a random number between 0-100,
and the user has to guess it in 10 tries.
*/
package prog1lab4;
import java.util.Scanner;
import java.util.Random;

public class ZeroToHundredGenerator {
    
    public static void main(String[] args) {
        //Create a Scanner for user input
        Scanner keyboard = new Scanner(System.in);
                
        //Create variables
        int guess; //number guessed by user
        int decision = 1; //to retry the game or not
        int counter = 0; //number of trials
        
        //Print introduction
            System.out.println("Hello! And welcome to this game. I will generate"
                    + " a random number between 0 and 100, and you must guess what number it is. ");
            System.out.println("Be careful, you have 10 trials!");
            
        //Generate a random number
        Random rdm = new Random();
        int random = rdm.nextInt(101);
        
        do{
            //Print instructions for the user
            System.out.print("Please enter your new guess: ");
            //Store the data
            guess = keyboard.nextInt();
            
            //Increment the counter by 1
            counter ++;
            
            //Print the result
            System.out.println("You entered " + guess + ". This is your attempt #" + counter);
            
            //Determine if the answer matches the random number or not
            if (guess == random){
                System.out.println("Congratulations! You found the right number. Press any number to try again,"
                    + " or press 0 to exit the game.");
                decision = keyboard.nextInt();
                //If they do not enter 0, generate a new random number
                random = rdm.nextInt(101);
            }else{
                System.out.println("This is not the right number.");
            }
        }while (counter<10 && decision!=0);
        
        System.out.println("Thanks for playing!");
    } 
}
