package com.ds;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]) {

        int intArray[] = {1, 5, 4, -4, 9, -2};

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {

                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
        }
        Arrays.stream(intArray).forEach(System.out::println);
    }

    static void swap (int arr[], int i, int j) {

        if (i==j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
