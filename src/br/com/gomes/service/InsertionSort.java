package br.com.gomes.service;

import java.util.Scanner;

public class InsertionSort {

    public static int[] ordenar(int[] array) {
        System.out.printf("Quantos items do vetor quer ordenar? [0 para todos]: ");
        int n = new Scanner(System.in).nextInt();
        for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && key < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
            if(n == 0) return array;
            n--;
        }
        return array;
    }
}
