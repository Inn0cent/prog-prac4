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
    int totalGamesVsComp = 0;
    int totalGuesses = 0;
    int totalGuessesVsComp = 0;
    int gamesHumanWon = 0;
    int guessesPerGame = 0;
    HiLo game;
    ComputerPlayer AI;
    StringInput guess;
        
    public GameManager()
    {
        guess = new StringInput();
    }
    
    public void newGame(int limit) {
        game = new HiLo(limit);
        guessesPerGame = 0;
        while (!game.hasWon()){
            game.makeGuess(guess.newGuess());
            guessesPerGame += 1;
        }
        System.out.println("You found it!");
        totalGames += 1;
        totalGuesses += guessesPerGame;
    }
    
    public void playVsComputer(int limit){
        newGame(limit);
        totalGuessesVsComp += guessesPerGame;
        AI = new ComputerPlayer(adjustDifficulty(limit));
        totalGamesVsComp += 1;
        if (guessesPerGame < AI.returnNoOfGuesses()){
            System.out.println("You beat the AI!");
            gamesHumanWon += 1;
        } else if (guessesPerGame > AI.returnNoOfGuesses()){
            System.out.println("You lost to a computer :(");
        } else {
            System.out.println("It was a draw");
        }
    }

    public double averageGuesses(){
        if (totalGames > 0 || totalGamesVsComp > 0){
            return (totalGuesses*1.0)/(totalGames + totalGamesVsComp);
        }
        return 0;
    }
    
    public double avgGuessesVsComp(){
        if (totalGamesVsComp > 0){
            return (totalGuessesVsComp*1.0)/totalGamesVsComp;
        }
        return 0;
    }
    
    public int adjustDifficulty(int limit){
        if (totalGamesVsComp/4 > gamesHumanWon && totalGamesVsComp >= 4){ //the limit is only adjusted    
            return (int)(limit*1.5);                                     //if they have played enough games  
        } else if((3*totalGamesVsComp)/4 < gamesHumanWon && totalGamesVsComp >= 4){
            return (int)(limit*0.75);
        }
        return limit;
    }
    
}












