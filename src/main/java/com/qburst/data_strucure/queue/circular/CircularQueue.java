package com.qburst.data_strucure.queue.circular;

/**
 * Created by albinmathew on 21/10/14.
 */
public class CircularQueue {
    private CQueueNode ref;
    private CQueueNode last;

    CircularQueue() {
        ref = null;
        last = null;
    }

    public void enqueue(String in) {
        CQueueNode temp = new CQueueNode(in);

        if (isEmpty()) {
            temp.next = temp;
            ref = temp;
            last = temp;
        }

        else {
            temp.next = ref;
            last.next = temp;
            ref = temp;
        }
    }

    public void rotate() {

        if (!isEmpty()) {
            ref = ref.next;
            last = last.next;
        }
    }

    public String dequeue() {
        if (!isEmpty()) {
            String temp = ref.data;
            if (ref.next == ref) {
                ref = null;
                last = null;
            }
            else {
                ref = ref.next;
                last.next = ref;
            }
            return temp;
        } else
            return null;
    }

    public String peek() {
        if (!isEmpty())
            return ref.data;
        else
            return null;
    }

    public boolean isEmpty() {
        return (ref == null);
    }
}
