package br.com.gomes.util;

import br.com.gomes.service.InsertionSort;

public class ArrayUtils {
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printArray(int[][] array) {
        System.out.print("[ \n");
        for(int[] num : array) {
           printArray(num);
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

    public static void printEx(int[] array, int[] arrayOrdenado) {
        System.out.printf("Entrada: ");
        printArray(array);
        System.out.printf("Saída: ");
        printArray(arrayOrdenado);
    }

    public static void printEx(String[] array, String[] arrayOrdenado) {
        System.out.printf("Entrada: ");
        printArray(array);
        System.out.printf("Saída: ");
        printArray(arrayOrdenado);
    }

    public static void printEx(int[][] array, int[][] arrayOrdenado) {
        System.out.printf("Entrada: ");
        printArray(array);
        System.out.printf("Saída: ");
        printArray(arrayOrdenado);
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
