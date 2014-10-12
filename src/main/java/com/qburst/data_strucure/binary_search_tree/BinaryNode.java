package com.qburst.data_strucure.binary_search_tree;

/**
 * Created by albinmathew on 12/10/14.
 */
public class BinaryNode {

    Comparable element;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(Comparable theElement) {
        this(theElement, null, null);
    }

    BinaryNode(Comparable theElement, BinaryNode lt, BinaryNode rt) {
        element = theElement;
        left = lt;
        right = rt;
    }
}
