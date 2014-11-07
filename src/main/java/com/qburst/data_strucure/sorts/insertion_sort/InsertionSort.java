package com.qburst.data_strucure.sorts.insertion_sort;

/**
 * Created by albinmathew on 7/11/14.
 */
public class InsertionSort {

    public static void main(String a[]){
        InsertionSort sort = new InsertionSort();
        int[] arr1 = {4, 2, 9, 6, 23, 5, 52, 12, 34, 0, 1};
        int[] arr2 = sort.insertionSort(arr1);
        for(int i:arr2){
            System.out.print(i + ",");
        }
    }

    public  int[] insertionSort(int[] input){
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
