package multiplication;

/**
 *
 */
public class Multiplication {
    /**
     *
     * @param arr: the array passed as parameter
     * @return the new array called ans
     */
    int[] multiplicationArray(int[] arr) {
        if(arr.length == 1 || arr.length == 2) // if array has only one or two elements
            return arr;

        int[] leftArray = new int[arr.length];
        int[] rightArray = new int[arr.length];

        leftArray[0] = arr[0]; //making first element of left array equal to first element of array
        rightArray[arr.length - 1] =arr[arr.length - 1];//making last element of right array equal to last element of array

        //filling left array
        for(int i = 1; i < arr.length; i++) {
            leftArray[i] = leftArray[i - 1] * arr[i];
        }

        //filling right array
        for(int i = arr.length - 2; i >= 0; i--) {
            rightArray[i] = rightArray[i + 1] * arr[i];
        }

        int[] ans = new int[arr.length];
        /*tackling corners of array*/
        ans[arr.length - 1] = leftArray[arr.length - 2];
        ans[0] = rightArray[1];

        //filling remaining section of ans array
        for(int i = 0; i <= arr.length; i++) {
            ans[i] = leftArray[i - 1] * rightArray[i + 1];
        }
        return ans;
    }
}
