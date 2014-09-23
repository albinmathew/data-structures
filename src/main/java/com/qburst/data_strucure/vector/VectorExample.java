package com.qburst.data_strucure.vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by albinmathew on 23/9/14.
 */
public class VectorExample {

    public static void main(String args[]) {

        Vector vector = new Vector(3, 2);
        System.out.println("Initial size: " + vector.size());
        System.out.println("Initial capacity: " + vector.capacity());

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);


        System.out.println("Capacity after four additions: " +
                vector.capacity());

        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        if(vector.contains(3)) {
            System.out.println("Vector contains 3.");
        }

        Enumeration vEnum = vector.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements()){
            System.out.println(vEnum.nextElement());

        }
    }
}
