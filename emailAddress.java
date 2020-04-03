/*
Lisa Hanna
31 March, 2020
Step 2 of Lab4 -- Program that verifies if an email address is valid
*/
package prog1lab4;
import java.util.Scanner;

public class emailAddress {
    
    public static void main(String[] args) {
        //Create a Scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Print instructions for the user
        System.out.print("Hello! Please enter your email address: ");
        //Store the string
        String email = keyboard.next().trim();
        //Get the length of the string
        int length = email.length();
         
        //Create a for loop to go over each character
        for(int i = 0; i <= length; i++){
            if(email.contains("@")){
                //Get the index of the @ sign
                int atSign = email.indexOf("@");
                
                //Get the substring for the ending to very if it is valid
                String ending = email.substring(atSign, length);
                
                if (ending.contains(".")){
                    //Get the index of the .
                    int dot = ending.indexOf(".");
                    
                    //Get two seperate substrings to see if there are two words seperated by the .
                    String word1 = email.substring(atSign, dot);
                    String word2 = email.substring(dot, length);
                    //Get the length of both
                    int length1 = word1.length();
                    int length2 = word2.length();
                    
                    //If both words contain characters, proceed to the last step
                    if (length1 >1 && length2 > 1){
                        //Get the substring of the beginning of the email
                        String beginning = email.substring(0, atSign);
                        //Get the length
                        int length3 = beginning.length();
                        
                        //Check if it contains multiple characters or not
                        if (length3>1){
                            System.out.println("You have a valid email!");
                        }else{
                            System.out.println("Sorry, that is not a valid email.");
                        }
                    }else{
                        System.out.println("Sorry, that is not a valid email.");
                    }
                }else{
                    System.out.println("Sorry, that is not a valid email.");
                }
            }else{
                System.out.println("Sorry, that is not a valid email.");
            }
        }
    }         
}
