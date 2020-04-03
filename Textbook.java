/*
Lisa Hanna
31 March, 2020
Step 4 of Lab4 -- Various textbook problems
*/
package prog1lab4;
import java.util.*;

public class Textbook {
    public static void main(String[] args) {
        //Create a scanner for the following numbers
        Scanner keyboard = new Scanner(System.in);
        
        //----------------------------------------------------------------------
        //EXERCISE #43: Program that asks the user for a value greater than 10, 
        //and keeps square-rooting using a loop.
        
        System.out.println("\nEXERCISE #43");
        System.out.println("--------------------------------------");
        
        //Instantiate a variable for the squareroot results
        double result;
        
        //Print instructions for user
        System.out.print("Hello! Please enter a value that is greater than 10: ");
        //Store the data
        double value = keyboard.nextDouble();
        
        //Create a while loop that forces the user to respect the condition
        while (value <=10){
            System.out.print("Sorry, that is not a valid value. Please enter a new one: ");
            value = keyboard.nextDouble();
        }
        
        //Square root the value a first time
        result = Math.sqrt(value);
        //Verify if the value is smaller than 1.01
        if (result <1.01){
            System.out.println("The result is now  equal to " + result + ", therefore smaller than "
                    + "1.01! Goodbye.");
        //Else keep looping square roots
        } else {
            while(result >= 1.01){
                result = Math.sqrt(result);
                System.out.println("Result = " + result);
            }
        }
        System.out.println("The result is now smaller than 1.01! Goodbye.");
        
        
        //----------------------------------------------------------------------
        //EXERCISE #44: Program that keeps asking the user for a word until it contains the "@" character
        
        System.out.println("\nEXERCISE #44");
        System.out.println("--------------------------------------");
        
        //Print the instructions
        System.out.print("Hello! Please enter a word with the \"@\" symbol included ");
        //Decoy scanner
        String decoy = keyboard.nextLine();
        //Actual scanner to store the data
        String word = keyboard.nextLine();
        //Print the word
        System.out.println("Your word is " + word);
        
       //Keep asking the user for a word until it contains the character
        while (!word.contains("@")){
            System.out.print("That is not a valid word. Please try again: ");
            word = keyboard.nextLine();
        }
        System.out.println("Your word is " + word + ". Goodbye.");
        
        
        //----------------------------------------------------------------------
        //EXERCISE #46: Program that uses for loops to sum the integers between 10 and 20 (inclusive)
        
        System.out.println("\nEXERCISE #46");
        System.out.println("--------------------------------------");
        
        //Instantiate a variable sum, and set it to 0
        int sum = 0;
        for (int i = 10; i<=20; i++){
            sum += i;
        }
        System.out.println("The sum of the integers between 10 and 20 is equal to " + sum);
    }
}
