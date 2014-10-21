package com.qburst.data_strucure.queue.priority;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by albinmathew on 20/10/14.
 */
public class PriorityQueueExample {

    public static  void main(String[] args){
        PriorityQueueExample priority = new PriorityQueueExample();
        Queue<Integer> pQueue = new PriorityQueue<Integer>(10);
        Random random = new Random();

        for(short i=0;i<10;i++){
            pQueue.add(random.nextInt(100));
        }
        System.out.println(pQueue);
        for(short i=0;i<10;i++) {
            System.out.println(pQueue.poll());
        }
        System.out.println();
        Queue<Customer> pCustomerQueue = new PriorityQueue<Customer>(10,idComparator);
        priority.addDataToQueue(pCustomerQueue);
        priority.pollDataFromQueue(pCustomerQueue);

    }

    public static Comparator<Customer> idComparator = new Comparator<Customer>(){
        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());
        }
    };

    private  void addDataToQueue(Queue<Customer> customerPriorityQueue) {
        Random rand = new Random();
        for(int i=0; i<10; i++){
            int id = rand.nextInt(1000);
            customerPriorityQueue.add(new Customer("user"+id,id));
        }
    }

    private  void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
        while(true){
            Customer customer = customerPriorityQueue.poll();
            if(customer == null) break;
            System.out.println("Processing Customer = " + customer.getName());
        }
    }
}
