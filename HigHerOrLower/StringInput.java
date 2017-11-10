import java.io.*; 

public class StringInput 
{ 
    private BufferedReader reader; 
     
    public StringInput() 
    { 
        reader = new BufferedReader(new InputStreamReader(System.in)); 
    } 
 
 
    public int newGuess() throws IOException 
    {          
            System.out.print( "Please enter your number: " ); 
            
            String input = reader.readLine();
            
            int number = Integer.parseInt(input);
            
            return number;
                                
    } 
} 
