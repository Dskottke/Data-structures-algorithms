package org.example.sort_algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }

    }

    public static void main(String[] args) {

        int[] array = {4, 2, 6, 5, 1, 3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
