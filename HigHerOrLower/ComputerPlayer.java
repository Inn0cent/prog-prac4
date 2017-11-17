
/**
 * Write a description of class ComputerPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerPlayer
{
    int guess;
    int result;
    int noOfGuesses = 0;
    HiLo game;
        
    public ComputerPlayer(int limit)
    {
        int low = 0;
        int high = limit;
        guess = (int)(Math.ceil((low+high)/2));
        game = new HiLo(limit);
        while (!game.hasWon()){
            System.out.println(guess);
            result = game.makeGuess(guess);
            if (result < 0){
                high = guess;
                guess = (int)(Math.ceil((low+high)/2));
            } else if (result > 0){
                low = guess + 1;
                guess = (int)(Math.ceil((low+high)/2));
            }
            noOfGuesses += 1;
        }
    }
    
    public int returnNoOfGuesses(){
        return noOfGuesses;
    }
   

}
