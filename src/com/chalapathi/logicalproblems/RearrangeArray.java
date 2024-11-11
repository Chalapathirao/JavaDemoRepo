package com.chalapathi.logicalproblems;

import java.util.Arrays;

public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                // Swap negative and positive elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, -6, 7};
        System.out.println(Arrays.toString(arr));
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
        /*for (int num : arr) {
            System.out.print(num + " ");
        }*/
    }
}