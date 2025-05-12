package br.com.gomes.service;

import br.com.gomes.util.ArrayUtils;

public class BubbleSort {
    public enum Ordem {
        CRESCENTE,
        DECRESCENTE
    }

    public static int[] ordenar(int[] array, Ordem ordem) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j <  array.length - i - 1; j++) {
                if (array[j] > array[j + 1] && ordem == Ordem.CRESCENTE || array[j] < array[j + 1] && ordem == Ordem.DECRESCENTE) {
                    ArrayUtils.swap(array, j, j + 1);
                        trocou = true;
                }
            }
            if (!trocou) break;
        }
        return array;
    }
}
