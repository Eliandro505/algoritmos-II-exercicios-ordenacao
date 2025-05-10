package br.com.gomes.util;

public class ArrayUtils {
    public static void printArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
