import java.io.BufferedReader;
import java.io.InputStreamReader;

class Cakes {
    
    private static String getAnswer(int cakes){ //Method to return the final answer
        int count = 1; // stores the round no.
        
        while(cakes>0){
            cakes-=count; // Decrementing the no. of cakes
            if(cakes<1){
                return "Darshak"; // if the last cake is eaten by Darshak
            }
                
                
            cakes-=(count * count); // Decrementing the no. of cakes
            if(cakes<1)
                return "Chandan"; // if the last cake is eaten by Chandan
                
                count++; // incrementing count to next round
        }
        return "thisWillNotReturn"; // just to meet the return type of method(this statement will never run)
    }
    
    public static void main(String args[] ) throws Exception { // Main method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader object to read the user input
        int cakes = Integer.parseInt(br.readLine()); // getting the no. of cakes initially
        
        System.out.println(getAnswer(cakes)); // Printing the value returned by getAnswer method.
    }
}

