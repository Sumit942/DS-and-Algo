package com.ds;

import java.util.Arrays;

public class InsertionSort {

    public static void main (String args[]) {

        int intArray[] = {1, 5, 4, -4, 9, -2};

        for (int firstUnSortedIndex = 1; firstUnSortedIndex < intArray.length; firstUnSortedIndex++) {
            int newElement = intArray[firstUnSortedIndex];

            int i;

            for (i = firstUnSortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }
        Arrays.stream(intArray).forEach(System.out::println);
    }

}
