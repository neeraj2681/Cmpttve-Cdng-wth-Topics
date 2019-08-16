package sum_of_numbers;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class SumOfNumbers {

    private static Map<Integer, Integer> presence = new HashMap<>(); // to store occurrence of each number with its position

    /**
     *
     * @param arr the array to process
     * @param k the sum to check for
     * @return the possibility of sum
     */
    private static boolean sumPossible(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) { // checking for each element
            if (presence.containsKey(k - arr[i])) { // if sum - current element is present in the array
                if ((k - arr[i]) == arr[i]) { // if sum - current element equal current element
                    return presence.get(k - arr[i]) != i; // return true if position of the element found is different
                    // than current element's position
                } else
                    return true;
            } else
                return false;
        }
        return false; // a necessary check
    }

        public static void main (String[] args){
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // dummy array

            for (int i = 0; i < arr.length; i++) {
                presence.put(arr[i], i); // putting each array element to map
            }
            System.out.println(sumPossible(arr, 10)); // a test case where required sum is 10
        }
    }
