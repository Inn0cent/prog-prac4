
/**
 * Write a description of class HiLo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiLo
{
    private int numberToGuess;
    private boolean won = false;

    public HiLo(int upperLimit)
    {
        numberToGuess = (int)(Math.random() * upperLimit) + 1;
    }

    public int makeGuess(int guess){
        if (guess == numberToGuess){
            won = true;
        } else if (guess < numberToGuess){
            System.out.println("Higher");
            return 1;
        } else {
            System.out.println("Lower");
            return -1;
        }
        return 0;
    }
    
    public boolean hasWon(){
        return won;
    }
    
}
