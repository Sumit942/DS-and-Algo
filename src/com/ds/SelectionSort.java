package com.ds;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String arr[]) {

        int intArray[] = {1, 5, 4, -4, 9, -2};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {

            int largestIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++ ) {
                if (intArray[i] > intArray[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(intArray, largestIndex, lastUnsortedIndex);
        }

        Arrays.stream(intArray).forEach(System.out::println);
    }

    static void swap (int arr[], int i, int j) {
        if (i == j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
