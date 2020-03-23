import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class AnnoyingChemistry {

    public static long gcd(long a, long b) {
        if(b == 0)
        return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, p, q;
        StringTokenizer tk = new StringTokenizer(br.readLine());

        x = Integer.parseInt(tk.nextToken());
        y = Integer.parseInt(tk.nextToken());
        p = Integer.parseInt(tk.nextToken());
        q = Integer.parseInt(tk.nextToken());
        long b3 = lcm(x, y);
        long c = p * b3;
        long h = b3 * q;
        long b1 = c / x;
        long b2 = h / y;
        long gcd1 = gcd(b1, b2);
        long gcd2 = gcd(gcd1, b3);
        System.out.println((b1 / gcd2)+" "+(b2 / gcd2)+" "+(b3 / gcd2));

    }
}

