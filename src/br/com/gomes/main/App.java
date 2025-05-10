package br.com.gomes.main;

import br.com.gomes.service.BubbleSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ordenacoesCrescentes();
    }

    private static void ordenacoesCrescentes() {
        int[] array = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        BubbleSort.ordenar(array, BubbleSort.Ordem.CRESCENTE);
    }
}
