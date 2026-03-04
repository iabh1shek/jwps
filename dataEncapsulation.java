public class dataEncapsulation {
    String color ; 
    String breed ; 


    String dogColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }

    
    String dogBreed(){
        return breed; 
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }


    public static void main(String args[]){
        dataEncapsulation dog1 = new dataEncapsulation(); 
        dog1.setColor("white");
        System.out.println(dog1.dogColor());
         

    }


}
    