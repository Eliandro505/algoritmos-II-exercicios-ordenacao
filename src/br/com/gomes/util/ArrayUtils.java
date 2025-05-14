package br.com.gomes.util;

public class ArrayUtils {
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printArray(String[] array) {
        System.out.print("[ ");
        for(String num : array) {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void swap(String[] array, int i, int j) {
        String aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
