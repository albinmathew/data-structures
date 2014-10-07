package com.qburst.data_strucure.doublylinkedlist;

import java.util.Scanner;

/**
 * Created by albin on 6/10/14.
 */
public class DoublyLinkedList {

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        System.out.println("List Size is : "+list.getSize());
        list.insertAtStart(25);
        list.insertAtEnd(36);
        list.display();
        System.out.println("List Size is : " + list.getSize());
        list.insertAtPos(53, 2);
        list.display();
        list.insertAtEnd(100);
        list.display();
        list.deleteAtPos(1);
        list.display();
    }

}
