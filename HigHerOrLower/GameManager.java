import java.io.*;
/**
 * Write a description of class GameManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameManager
{
    
    int totalGames = 0;
    int totalGuesses = 0;
    int guessesPerGame;
    HiLo game;
    StringInput guess;
        
    public GameManager()
    {
        guess = new StringInput();
    }
    
    public void newGame(int limit) {
        game = new HiLo(limit);
        guessesPerGame = 0;
        while (!game.hasWon()){
            try{ 
                game.makeGuess(guess.newGuess());
            } catch (IOException e){
                System.out.print("You inputted a letter in your number");
            }
            guessesPerGame += 1;
        }
        totalGames += 1;
        totalGuesses += guessesPerGame;
    }

    public double averageGuesses(){
        if (totalGames > 0){
            return totalGuesses/totalGames;
        }
        return -1 ;
    }
}












