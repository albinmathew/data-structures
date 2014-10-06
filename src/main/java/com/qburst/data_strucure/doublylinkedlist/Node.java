package com.qburst.data_strucure.doublylinkedlist;

/**
 * Created by albin on 6/10/14.
 */
public class Node {
    protected int data;
    protected Node next, prev;

    /* Constructor */
    public Node() {
        next = null;
        prev = null;
        data = 0;
    }

    /* Constructor */
    public Node(int d, Node n, Node p) {
        data = d;
        next = n;
        prev = p;
    }

    /* Function to set link to next node */
    public void setLinkNext(Node n) {
        next = n;
    }

    /* Function to set link to previous node */
    public void setLinkPrev(Node p) {
        prev = p;
    }

    /* Funtion to get link to next node */
    public Node getLinkNext() {
        return next;
    }

    /* Function to get link to previous node */
    public Node getLinkPrev() {
        return prev;
    }

    /* Function to set data to node */
    public void setData(int d) {
        data = d;
    }

    /* Function to get data from node */
    public int getData() {
        return data;
    }
}
