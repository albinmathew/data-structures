package com.qburst.data_strucure.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by albinmathew on 14/10/14.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // Displaying the Tree set data
        System.out.println(ts);

        Iterator<Integer> iterator = ts.iterator();
        System.out.println("Tree set data: ");

        // Displaying the Tree set data
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("First element : " + ts.first());
        System.out.println("Last element : " + ts.last());

        // Check empty or not
        if (ts.isEmpty()) {
            System.out.print("Tree Set is empty.");
        } else {
            System.out.println("Tree Set size: " + ts.size());
        }
    }
}
