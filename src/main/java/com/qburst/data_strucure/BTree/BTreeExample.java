package com.qburst.data_strucure.BTree;

/**
 * Created by albinmathew on 27/10/14.
 */
public class BTreeExample {
    public static void main(String[] args){
        BTree<String, Integer> bTree = new BTree<>();
        bTree.put("zero",0);
        bTree.put("one",1);
        bTree.put("two",2);
        bTree.put("three",3);
        bTree.put("four",4);
        bTree.put("five",5);

        System.out.println("Zero: " + bTree.get("zero"));
        System.out.println("One: "  + bTree.get("one"));
        System.out.println("Five: " + bTree.get("five"));
        System.out.println();

        System.out.println("size   :  " + bTree.size());
        System.out.println("height :  " + bTree.height());
        System.out.println();
        System.out.println(bTree);


    }

}
