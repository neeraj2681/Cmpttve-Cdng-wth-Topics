import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MinimumANDxorOR {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        int t = Integer.parseInt(br.readLine());
        int n, i = 0;
        int[] arr;
        StringTokenizer tk;
        while(t-- > 0) {
            i = 0;
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            tk = new StringTokenizer(br.readLine());
            while(tk.hasMoreTokens()) {
                arr[i++] = Integer.parseInt(tk.nextToken());
            }
            Arrays.sort(arr);
            i = 0;
            int min = Integer.MAX_VALUE;
            while(i < (n-1)) {
                if(min > (arr[i] ^ arr[i + 1])) {
                    min = arr[i] ^ arr[i + 1];
                }
                i++;
            }
            System.out.println(min);
        }
    }
}
