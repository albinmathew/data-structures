package com.qburst.data_strucure.arraylist;

import java.util.ArrayList;

/**
 * Created by albinmathew on 23/9/14.
 */
public class ArrayListExample {

    ArrayList arrayList;

    public ArrayListExample(int capacity){
        arrayList   = new ArrayList(capacity);
    }
    public void addAtIndex(int pos,Object element){
        arrayList.add(pos,element);
    }
    public  void add(Object element){
        arrayList.add(element);
    }
    public void remove(int index){
        arrayList.remove(index);
    }
    public void  remove(Object element){
        arrayList.remove(element);
    }
    public  boolean contains(Object element){
        boolean rs =arrayList.contains(element);
    return rs;
    }
    public void printArray(){
        System.out.println(arrayList);
    }

    public static void main(String[] args){
        ArrayListExample arrayListExample = new ArrayListExample(10);

        arrayListExample.add("one");
        arrayListExample.add("two");
        arrayListExample.addAtIndex(2,"three");
        arrayListExample.printArray();

        if(arrayListExample.contains("three")){
         arrayListExample.remove("three");
        }
        arrayListExample.printArray();
    }
}
