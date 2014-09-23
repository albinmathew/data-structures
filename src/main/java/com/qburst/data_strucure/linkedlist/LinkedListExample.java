package com.qburst.data_strucure.linkedlist;

import java.util.LinkedList;

/**
 * Created by albinmathew on 23/9/14.
 */
public class LinkedListExample {

    public static void main(String args[]) {

        LinkedList linkedList = new LinkedList();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");
        System.out.println("Original contents of linkedList: " + linkedList);

        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("Contents of linkedList after deletion: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedlist after deleting first and last: " + linkedList);

        Object val = linkedList.get(2);
        linkedList.set(2, val + " Changed");
        System.out.println("linkedList after change: " + linkedList);
    }
}
