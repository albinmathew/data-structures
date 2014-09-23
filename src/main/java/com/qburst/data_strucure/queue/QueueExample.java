package com.qburst.data_strucure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by albinmathew on 23/9/14.
 */
public class QueueExample {

    private Queue queue;

    public  QueueExample(){
        queue = new LinkedList();
    }

    private void add(String string) {
       queue.add(string);
    }
    private void remove() {
        print("Removed object is : "+ queue.remove());
    }
    private void peek (){
        print("Peeked object is : " + queue.peek());
    }
    private void size(){
        print("Size of Queue is : "+ queue.size());
    }
    private void print(String str){
        System.out.println(str);
    }

    public static  void main(String[] args){
        QueueExample queueExample = new QueueExample();
        queueExample.add("First");
        queueExample.add("Second");
        queueExample.add("Third");
        queueExample.add("Fourth");
        queueExample.size();
        queueExample.peek();
        queueExample.remove();
        queueExample.size();
        queueExample.peek();
        }
    }

