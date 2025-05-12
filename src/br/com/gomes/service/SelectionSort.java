package br.com.gomes.service;

import br.com.gomes.util.ArrayUtils;

public class SelectionSort {
    public static int[] ordenar(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            ArrayUtils.swap(array, i, minIndex);
        }
        return array;
    }
}
