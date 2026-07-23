import java.util.Random;

public class GuessingGame
{

    public void playgame() {
        int Gamemasterguess = RandomNumber();
        int player1guess = RandomNumber(); 
        int player2guess = RandomNumber(); 
        int player3guess = RandomNumber(); 

        System.out.println("Game Master guessed : "+ Gamemasterguess);
        System.out.println("Player1 guessed : "+ player1guess);
        System.out.println("Player2 guessed :" + player2guess);
        System.out.println("Player 3 guessed : " + player3guess); 

        
        if(isThereWinner(player1guess, player2guess, player3guess, Gamemasterguess)) { 
            System.out.println(PrintgameWinner(player1guess, player2guess, player3guess, Gamemasterguess)); 

        }   
        else{ 
            System.out.println("Winner still not decided , Game must continue");
            playgame() ; 
        }
        

        

    }

    public int RandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        return randomNumber;
    }

    public boolean isThereWinner(int player1guess, int player2guess, int player3guess, int Gamemasterguess) {
        if (Gamemasterguess == player1guess) {
            return true;
        } else if (Gamemasterguess == player2guess) {
            return true;
        } else if (Gamemasterguess == player3guess) {
            return true;
        }
        return false;
    }

    public String PrintgameWinner(int player1guess, int player2guess, int player3guess, int Gamemasterguess) { 
        if (Gamemasterguess == player1guess) {
            return "Player 1 wins"; 
        } else if (Gamemasterguess == player2guess) {
            return "Player 2 wins"; 
            
        } else if (Gamemasterguess == player3guess) {
            return "Player 3 wins "; 
        }
        return ""; 
    }

    public static void main(String[] args) {

        GuessingGame game = new GuessingGame() ; 
        game.playgame() ;        
        
    }

}

