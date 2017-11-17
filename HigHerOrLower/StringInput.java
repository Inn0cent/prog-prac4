import java.io.*; 

public class StringInput 
{ 
    private BufferedReader reader; 
     
    public StringInput() 
    { 
        reader = new BufferedReader(new InputStreamReader(System.in)); 
    } 
 
 
    public int newGuess() //throws IOException 
    {          
            System.out.print( "Please enter your number: " ); 
            String input = "0";
            int number = 0;
            try{
                input = reader.readLine();
            } catch (IOException e){
                System.out.println("You caused an IOException.");
            }
            
            try{
                number = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("You inputted a letter in your number, your guess is now 0");
            }
            
            return number;
                                
    } 
} 
