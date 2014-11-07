package com.qburst.data_strucure.sorts.bubble_sort;

/**
 * Created by albinmathew on 7/11/14.
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] input = {4, 2, 9, 6, 23, 5, 52, 12, 34, 0, 1};
        sort.bubbleSort(input);
    }

    public void bubbleSort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }

    private void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }
}
