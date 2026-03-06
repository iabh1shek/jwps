import java.util.Scanner; 
public class pairing {
    public static void main(String args[]){
        Scanner show_sumui = new Scanner(System.in); 
 
        System.out.println("enter first number : "); 
        int firstNumber = show_sumui.nextInt(); 

        show_sumui.nextLine(); 
        System.out.println("enter second number : "); 
        int secondNumber = show_sumui.nextInt(); 
        show_sumui.nextLine(); 


        System.out.println(firstNumber + "+"+secondNumber + "=" + (firstNumber + secondNumber)); 
        show_sumui.close(); 
        // System.out.println("Four : " +  (2 + 2));         ---> it will print 4 
        // System.out.println("But! Twenty two : " + 4 + 2); --> it will print 42  


        
    }
}
