package com.qburst.data_strucure.application;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by albinmathew on 19/9/14.
 */
public class StackUsingLinkedList <Item> implements Iterable<Item>{

        private Node first;  //Top of the Stack, Most recently added node
        private int N;

    public StackUsingLinkedList() {

    }

    private class Node
        {
            Item item;
            Node next;
        }

        public boolean isEmpty()
        {
            return first == null;
        }

        public int size()
        {
            return N;
        }

        public void push(Item item)
        {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
            N++;
        }
        public Item pop()
        {
            Item item = first.item;
            first = first.next;
            N--;
            return item;
        }
        public Iterator<Item> iterator()
        { return new ListIterator(); }

        private class ListIterator implements Iterator<Item>
        {
            private Node current = first;

            public boolean hasNext()
            {
                return current!= null;
            }
            public void remove() {}
            public Item next()
            {
                Item item = current.item;
                current = current.next;
                return item;
            }
        }

        public static void main(String[] args)
        {
            StackUsingLinkedList s = new StackUsingLinkedList();
            System.out.println("Enter items\n");
            Scanner in = new Scanner(System.in);
            while (in.hasNext())
            {
                String item = in.next();
                if (!item.equals("pop")) {
                    s.push(item);
                }
                else if (!s.isEmpty()) {
                    System.out.println(s.pop());
                }
                else if(s.isEmpty()){
                    System.out.println("stack is empty...!!!");
                }
            }
            System.out.println(" ( " +s.size() + " left on stack )");

        }
    }
