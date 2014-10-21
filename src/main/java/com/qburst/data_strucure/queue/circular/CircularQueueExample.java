package com.qburst.data_strucure.queue.circular;

/**
 * Created by albinmathew on 21/10/14.
 */
public class CircularQueueExample {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();

        for (int i = 1; i <= 5; i++) {
            cq.enqueue("User " + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println( cq.peek());
            cq.rotate();
        }

        System.out.println("Removing a user: " + cq.dequeue());

        System.out.println("Rotating...");
        cq.rotate();

        System.out.println("Adding another user");
        cq.enqueue("User 6");

        for (int i = 0; i < 5; i++) {
            System.out.println(cq.peek());
            cq.rotate();
        }

        System.out.println("Removing all...");
        while (!cq.isEmpty()) {
            System.out.println("Removing " + cq.dequeue());
        }

        if(cq.isEmpty()){
            System.out.println("Empty Queue");
        }

    }
}
