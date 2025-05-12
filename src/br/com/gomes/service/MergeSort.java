package br.com.gomes.service;

import br.com.gomes.util.ArrayUtils;

public class MergeSort {
    public static int[] ordenar(int[] array) {
        int arrayLength = array.length;

        if(arrayLength <= 1) return array;

        int midIndex = arrayLength / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arrayLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }
        for(int i = midIndex; i < arrayLength; i++) {
            rightArray[i - midIndex] = array[i];
        }

        MergeSort.ordenar(leftArray);
        MergeSort.ordenar(rightArray);

        merge(array, leftArray, rightArray);

        return array;
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize) {
            if(leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
