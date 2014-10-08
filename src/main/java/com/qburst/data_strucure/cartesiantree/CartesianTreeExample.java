package com.qburst.data_strucure.cartesiantree;

import java.util.Scanner;

/**
 * Created by albinmathew on 8/10/14.
 */
public class CartesianTreeExample {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cartesian Tree Test\n");
        System.out.println("Enter number of integer values");
        int N = scan.nextInt();
        int arr[] = new int[N];
        System.out.println("\nEnter "+ N +" integer values");
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        /* Make cartesian tree from given array */
        CartesianTree ct = new CartesianTree(arr);
        /* Print tree details */
        System.out.println("\nTree Details :");
        System.out.println("Empty status - "+ ct.isEmpty());
        System.out.println("No of nodes - "+ ct.countNodes());
        System.out.print("Post order : ");
        ct.postOrder();;
        System.out.print("\nPre order : ");
        ct.preOrder();
        System.out.print("\nIn order : ");
        ct.inOrder();
        System.out.println();
    }
}
