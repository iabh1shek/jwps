import java.util.Scanner;
class Seconds{ 

    public static void main(String args[]){

        Scanner days = new Scanner(System.in); 
        System.out.println("enter number of days : "); 

        int user_days = days.nextInt(); 

        int totalNumberofseconds = user_days * (3600 * 24); 

        System.out.println(totalNumberofseconds); 
        days.close(); 


        

    
    }


}
