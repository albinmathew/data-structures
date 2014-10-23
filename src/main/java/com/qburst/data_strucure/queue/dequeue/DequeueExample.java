package com.qburst.data_strucure.queue.dequeue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by albinmathew on 22/10/14.
 */
public class DequeueExample {
    private Deque deQueue;

    public  DequeueExample(){
        deQueue = new LinkedList();
    }

    private void add(String string) {
        deQueue.add(string);
    }
    private void addFirst(String string) {
        deQueue.addFirst(string);
    }
    private void addLast(String string) {
        deQueue.addLast(string);
    }
    private String getFirst() {
        return (String) deQueue.getFirst();
    }
    private String getLast() {
        return (String) deQueue.getLast();
    }
    private void remove() {
        print("Removed object is : " + deQueue.remove());
    }
    private void peek (){
        print("Peeked object is : " + deQueue.peek());
    }
    private void size(){
        print("Size of DeQueue is : " + deQueue.size());
    }
    private void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args){
        DequeueExample dequeue = new DequeueExample();
        dequeue.add("first");
        dequeue.add("second");
        dequeue.add("third");
        dequeue.add("fourth");
        dequeue.size();
        dequeue.peek();
        dequeue.remove();
        dequeue.size();
        dequeue.addFirst("added as first");
        dequeue.addLast("added as last");
        dequeue.size();
        System.out.println(dequeue.getFirst());
        System.out.println(dequeue.getLast());
    }
}
