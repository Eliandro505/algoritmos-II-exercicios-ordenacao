package br.com.gomes.main;

import br.com.gomes.service.*;
import br.com.gomes.util.ArrayUtils;

public class App {
    public static void main(String[] args) {
        ordenacoesCrescentes();
    }

    private static void ordenacoesCrescentes() {
        int[] array = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        System.out.println("BubbleSort");
        ArrayUtils.printArray(BubbleSort.ordenar(array.clone(), BubbleSort.Ordem.CRESCENTE));
        System.out.println("SelectionSort");
        ArrayUtils.printArray(SelectionSort.ordenar(array.clone()));
        System.out.println("InsertionSort");
        ArrayUtils.printArray(InsertionSort.ordenar(array.clone()));
        System.out.println("MergeSort");
        ArrayUtils.printArray(MergeSort.ordenar(array.clone()));
    }
}
