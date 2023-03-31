package org.example.sort_algorithm;

public class Main {

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 6, 5, 1, 3};
        bubbleSort(array);
        printArray(array);
    }

}

