package com.chalapathi.problemsolving;

import java.util.Arrays;

public class MoveAllZeosToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] arr1 = pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr1));

        /*// Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }*/
    }
    // function to move all zeros to the end
    static int[] pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        // to keep track of the index in temp[]
        int j = 0;
        // Copy non-zero elements to temp[]
        for (int k : arr) {
            if (k != 0)
                temp[j++] = k;
        }
        // Fill remaining positions in temp[] with zeros
        while (j < n)
            temp[j++] = 0;
        // Copy all the elements from temp[] to arr[]
        /*for (int i = 0; i < n; i++)
            arr[i] = temp[i];*/
        //System.arraycopy(temp, 0, arr, 0, n);
        return temp;

    }
}
