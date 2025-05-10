package br.com.gomes.service;

import br.com.gomes.util.ArrayUtils;

public class BubbleSort {
    public static void ordenar(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            boolean trocou = false;
            for(int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    ArrayUtils.swap(array, j, j+1);
                    trocou = true;
                }
            }
            if(!trocou) break;
        }
        ArrayUtils.printArray(array);
    }
}
