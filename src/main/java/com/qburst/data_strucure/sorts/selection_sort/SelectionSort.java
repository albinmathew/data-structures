package com.qburst.data_strucure.sorts.selection_sort;

/**
 * Created by albinmathew on 7/11/14.
 */
public class SelectionSort {

    public static void main(String a[]) {
        SelectionSort sort = new SelectionSort();
        int[] arr1 = {4, 2, 9, 6, 23, 5, 52, 12, 34, 0, 1};
        int[] arr2 = sort.selectionSort(arr1);
        for (int i : arr2) {
            System.out.print(i+ ", ");

        }
    }

    public int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
