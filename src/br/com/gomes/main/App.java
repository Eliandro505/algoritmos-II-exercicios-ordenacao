package br.com.gomes.main;

import br.com.gomes.service.*;
import br.com.gomes.util.ArrayUtils;

public class App {
    public static void main(String[] args) {
//        ordenacoesCrescentes();
//        ordenacaoDecrescente();
//        ordenacaoArrayStrings();
//        ordenacaoParcial();
        ordenacaoMatrizes();
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

    private static void ordenacaoDecrescente() {
        int[] array = {3, 0, -2, 5, 8};
        int[] arrayOrdenado = BubbleSort.ordenar(array, BubbleSort.Ordem.DECRESCENTE);
        ArrayUtils.printEx(array, arrayOrdenado);
    }

    private static void ordenacaoArrayStrings() {
        String[] array = {"bbb", "aaa", "ccc"};
        String[] arrayOrdenado = SelectionSort.ordenar(array);
        ArrayUtils.printEx(array, arrayOrdenado);
    }

    private static void ordenacaoParcial() {
        int[] array = {8, 4, 3, 7, 6, 5, 2};
        int[] arrayOrdenado = InsertionSort.ordenar(array);
        ArrayUtils.printEx(array, arrayOrdenado);
    }

    private static void ordenacaoMatrizes() {
        int[][] array = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        int[][] arrayOrganizado = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        for(int[] arrayInterno : arrayOrganizado) {
            arrayInterno = SelectionSort.ordenar(arrayInterno);
        }
        ArrayUtils.printEx(array, arrayOrganizado);
    }
}
