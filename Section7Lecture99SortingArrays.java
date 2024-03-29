package com.curiosity;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	int[] myIntegers = getIntegers(5);
	int[] sorted = sortIntegers(myIntegers);
	printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
    }
}
    public static int[] sortIntegers(int[] array) {
        int[] sortedArrays = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArrays[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArrays.length - 1; i++) {
                if (sortedArrays[i] < sortedArrays[i + 1]) {
                    temp = sortedArrays[i];
                    sortedArrays[i] = sortedArrays[i + 1];
                    sortedArrays[i + 1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArrays;
    }
}
