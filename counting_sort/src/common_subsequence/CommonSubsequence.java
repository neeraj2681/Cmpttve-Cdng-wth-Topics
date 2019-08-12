import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {

    //This method returns the final answer i.e. "Yes" or "No"
    static String doesExist(String s1, String s2){
        int count1[] = new int[123];
        int count2[] = new int[123];

        //Counting the characters of first string.
        for(int j=0; j<s1.length(); j++){
            count1[s1.charAt(j)]++;
        }

        //Counting the characters of second string.
        for(int j=0; j<s2.length(); j++){
            count2[s2.charAt(j)]++;
        }

        //Iteration from 97 to 122
        for(int j=97; j<123; j++){
            if(count1[j] > 0 && count2[j] > 0) //if common character exist
                return "Yes";
        }
        return "No"; // if common character does'nt exist
    }

    public static void main(String args[] ) throws Exception { //Main Method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader object to read User Input(Buffered Readers are generally faster coma)
 
       int t = Integer.parseInt(br.readLine());

        while(--t>=0){
            String s1 = br.readLine();
            String s2 = br.readLine();

            System.out.println(doesExist(s1, s2)); // Printing the final answer
        }
    }
}
