package br.com.gomes.service;

import br.com.gomes.util.ArrayUtils;

public class SelectionSort {
    public static void ordenar(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length - 1; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            ArrayUtils.swap(array, i, minIndex);
        }
        ArrayUtils.printArray(array);
    }
}
