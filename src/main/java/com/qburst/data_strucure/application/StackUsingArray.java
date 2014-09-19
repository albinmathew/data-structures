package com.qburst.data_strucure.application;

import java.util.Scanner;

/**
 * Created by albinmathew on 18/9/14.
 */


public class StackUsingArray {

    private String[] stack;
    private int N;

    public StackUsingArray(int cap)
    {
        stack = new String[cap];
    }

    public boolean isEmpty()
    {
        return N==0;
    }

    public int size()
    {
        return N;
    }

    public void push (String item)
    {
        stack[N++] = item;
    }

    public String pop ()
    {
        return stack[--N];
    }

    public static void main(String[] args){

        StackUsingArray s = new StackUsingArray(100);
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
