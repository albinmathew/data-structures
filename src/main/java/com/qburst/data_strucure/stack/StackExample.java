package com.qburst.data_strucure.stack;

import java.util.Stack;

public class StackExample {

    private Stack<String> stringStack;

    public StackExample(){
        stringStack = new Stack<String>();
        stringStack.push("First");
        stringStack.push("Second");
        stringStack.push("Third");

        print("Stack size is "+ stringStack.size());
        print(stringStack.pop() + " Popped");
        print("Stack size is "+ stringStack.size());
        print(stringStack.peek() + " Peeked");
        print("Stack size is "+ stringStack.size());
    }

    private void print(String str){
        System.out.println(str);
    }


    public static void main(String[] args){
        StackExample stackExample = new StackExample();

    }
}
