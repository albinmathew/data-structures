package com.qburst.data_strucure.set.hashset;

import java.util.Collections;
import java.util.HashSet;

/**
 * Created by albin on 29/9/14.
 */
public class HashSetExample {
 public static  void main(String[] args){
     HashSet<Integer> hashSet = new HashSet<Integer>();

     hashSet.add(0);
     hashSet.add(1);
     hashSet.add(2);
     hashSet.add(3);
     hashSet.add(4);
     hashSet.add(5);

     Integer min = Collections.min(hashSet);
     Integer max = Collections.max(hashSet);

     System.out.println("HashSet contains" + hashSet);
     System.out.println("Size of HashSet " + hashSet.size());
     System.out.println("Minimum Element of  HashSet is : " + min);
     System.out.println("Maximum Element of  HashSet is : " + max);

 }
}
