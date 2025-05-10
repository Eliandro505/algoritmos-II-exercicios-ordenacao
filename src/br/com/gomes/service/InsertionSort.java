package br.com.gomes.service;

import br.com.gomes.util.ArrayUtils;

public class InsertionSort {
    public static void ordenar(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && key < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        ArrayUtils.printArray(array);
    }
}
