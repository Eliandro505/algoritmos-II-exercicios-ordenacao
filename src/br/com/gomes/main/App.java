package br.com.gomes.main;

import br.com.gomes.service.*;
import br.com.gomes.util.ArrayUtils;

public class App {
    public static void main(String[] args) {
        ordenacoesCrescentes();
    }

    private static void ordenacoesCrescentes() {
        int[] array = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        ArrayUtils.printArray(BubbleSort.ordenar(array.clone(), BubbleSort.Ordem.CRESCENTE));
        ArrayUtils.printArray(SelectionSort.ordenar(array.clone()));
        ArrayUtils.printArray(InsertionSort.ordenar(array.clone()));
        ArrayUtils.printArray(MergeSort.ordenar(array.clone()));
    }
}
