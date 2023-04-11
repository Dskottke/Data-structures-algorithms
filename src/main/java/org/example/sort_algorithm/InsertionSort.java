package org.example.sort_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j > -1 && tmp < array[j]) {
                array[j + 1] = array[j];
                array[j] = tmp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5, 6};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
