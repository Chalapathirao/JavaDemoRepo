package com.chalapathi.sorting;

public class DSSorting {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);

        arr = new int[]{6, 8, 2, 4, 5, 9};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


    /*Selection Sort is a comparison-based sorting algorithm.
    It sorts an array by repeatedly selecting the smallest (or largest)
    element from the unsorted portion and swapping it with the first unsorted element.
    This process continues until the entire array is sorted.*/

    //overall complexity = O(n) * O(n) = O(n*n) = O(n2) n-square
    /* Advantages of Selection Sort
Easy to understand and implement, making it ideal for teaching basic sorting concepts.
Requires only a constant O(1) extra memory space.
It requires less numb of swaps (or memory writes) compared to many other standard algorithms.
Only cycle sort beats it in terms of memory writes. Therefore, it can be simple algorithm choice when memory writes are costly.
Disadvantages of the Selection Sort has a time complexity of O(n^2) makes it slower compared to algorithms like Quick Sort or Merge Sort.
Does not maintain the relative order of equal elements.
Does not preserve the relative order of items with equal keys which means it is not stable. */

    private static void selectionSort(int[] arr) {
//        Selection Sort is a comparison-based sorting algorithm.
//        It sorts an array by repeatedly selecting the smallest (or largest) element
//        from the unsorted portion and swapping it with the first unsorted element.
//        This process continues until the entire array is sorted.
        //64 25 12 22 11   //length 5
        // 0  1  2  3  4  //position
        // 11 | 25 12 22 64
        // 11, 12 25 22 64
        //11 12, 22 25 64

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds
            // the minimum element
            int min_idx = i;
            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }
            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }


    /*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
    the adjacent elements if they are in the wrong order.
    This algorithm is not suitable for large data sets as its average
    and worst-case time complexity are quite high.*/

    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[]) {
        int temp , n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

}
