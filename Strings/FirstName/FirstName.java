import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	
    public static void main(String args[] ) throws Exception { // Main Method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader object to read input
        int t = Integer.parseInt(br.readLine()); //No. of testcases
        while(t-->0){
            String s = br.readLine(); //input String
            int counts = 0, countj = 0; // counts for counting "SUVO" and countj for counting "SUVOJIT"

            for(int j=0; j<s.length(); j++){ //for loop to iterate through the string.
                
                if(s.charAt(j)=='S' && (j+6)<s.length()){ //for checking the occurrence of "SUVOJIT"
                    if(s.substring(j, j+7).equals("SUVOJIT")){ // if "SUVOJIT" is found within the bound of string length
                        countj++;
                        j+=6;
                        continue;
                    }
                }
                
                
                if(s.charAt(j)=='S' && (j+3)<s.length()){ //for checking the occurrence of "SUVO"
                    if(s.substring(j, j+4).equals("SUVO")){ // if "SUVO" is found within the bound of string length
                        counts++;
                        j+=3;
                        continue;
                    }
                }
                
                
                
                
            }
            
            System.out.println("SUVO = "+counts+", SUVOJIT = "+countj); //Printing final answer for the string
        }
    }
}

