/*
Lisa Hanna
31 March, 2020
Step 1 of Lab4 -- Program that verifies if a word is a palindrom
*/
package prog1lab4;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        //Create a scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Print instructions for the user
        System.out.print("Enter a string and I will verify if it is a Palindrome: ");
        //Store the data
        String word = keyboard.nextLine().trim();
        
        //Instantiate cleanWord to get the word that will be without spaces or punctiation
        String cleanWord = "";
        
        //Create a boolean to determine if the two words are the same
        Boolean isPalindrome = true;
        
        //Create a for loop that removes all punctuation and spaces
        for(int k = 0; k < word.length(); k++){
            if(word.charAt(k) != ' ' && word.charAt(k) != ',' && word.charAt(k) != '.' && word.charAt(k) != '\''){
                cleanWord += word.charAt(k);
            }
        }
        //Get the length of the cleanWord
        int length = cleanWord.length();
        
        //Create a for loop that compares the first letter with last letter,
        //Second letter with second-to-last letter, etc
        for(int j = 0; j < cleanWord.length(); j++){
            String firstLetter = cleanWord.substring(j, j + 1).toUpperCase();
            String secondLetter = cleanWord.substring(length - j - 1, length - j).toUpperCase();
            
            System.out.print(firstLetter);
            System.out.println(" = " + secondLetter);
            
            if(!firstLetter.equals(secondLetter)){
                isPalindrome = false;
                System.out.println("Those two letters are not equal therefore it is NOT a palindrome!");
                //to escape the for loop and end the program
                break;
            }
        }
        //If the comparison is true
        if(isPalindrome){
            System.out.println("It is a palindrome!");
        }
    }
}
