// read user message and print that message 

import java.util.Scanner; 
public class ReadingInput{


    public static void main(String args[]){
        Scanner message = new Scanner(System.in); 
        System.out.println("Enter you message here : "); 
        String usermessage = message.nextLine();
        System.out.println(usermessage); 
        message.close(); // closing the Scanner resource 
    }
}