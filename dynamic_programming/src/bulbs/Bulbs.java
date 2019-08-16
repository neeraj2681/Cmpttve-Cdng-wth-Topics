package bulbs;

import java.util.ArrayList;

/**
 * @author Niraj
 */
public class Bulbs {

    /**
     *
     * @param A the arraylist or simply an array
     * @return the no of switches required
     */
    public int bulbs(ArrayList<Integer> A) {
        int zeroes = 0; // to keep count of no of zeroes and hence no of switches
        for (int i = 0; i < A.size(); i++) { //traverse the whole array
            if (A.get(i) == 0) { // if the current element of arry is 0
                if (zeroes % 2 == 0) // if no of zeroes is even
                    zeroes++;
            } else { // if the current element of array is 1
                if (zeroes % 2 != 0) // if no of zeroes is odd
                    zeroes++;
            }
        }
        return zeroes; // return the no of switches required
    }
}