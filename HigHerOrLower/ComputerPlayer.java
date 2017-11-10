
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
    HiLo game;
        
    public ComputerPlayer(int limit)
    {
        guess = Integer.toInt(Math.floor(limit/2));
        game = new HiLo(limit);
        while (!game.hasWon()){
            result = game.makeGuess(guess);
            if (result < 0){
                guess = Math.floor(guess/2);
            } else if (result > 0){
                guess += Math.floor(guess/2);
            }
        }
    }
   

}
