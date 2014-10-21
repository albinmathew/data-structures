package com.qburst.data_strucure.queue.circular;

/**
 * Created by albinmathew on 21/10/14.
 */
public class CQueueNode {
    String data;
    CQueueNode next;

    CQueueNode(String data) {
        this.data = data;
        next = null;
    }
}
