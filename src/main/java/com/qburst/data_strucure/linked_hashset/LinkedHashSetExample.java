package com.qburst.data_strucure.linked_hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by albinmathew on 23/10/14.
 */
public class LinkedHashSetExample {

    private LinkedHashSet linkedHashSet;

    public LinkedHashSetExample() {
        linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(0);
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add(3.00);
    }
    public void printLinkedHashSet(){
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public  void size(){
        System.out.println(linkedHashSet.size());
    }
    public static  void main(String[] args){
        LinkedHashSetExample linkedHashSetExample = new LinkedHashSetExample();
        linkedHashSetExample.printLinkedHashSet();
        linkedHashSetExample.size();
    }


}
