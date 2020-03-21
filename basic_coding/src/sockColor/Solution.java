package sockColor;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Pankaj Kandpaal
 */
public class Solution {
    /**
     * @param arr the input array containing color code for each sock
     * @return the no of color pair socks
     */
    public static int sockColor(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int ans = arr[0];
        int frq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ans) {
                frq++;
            } else {
                count += (frq / 2);
                frq = 1;
                ans = arr[i];
            }
        }
        if (frq != 1) {
            count += (frq / 2);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(sockColor(arr));
    }
}
