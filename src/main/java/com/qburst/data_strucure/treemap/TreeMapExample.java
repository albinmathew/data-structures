package com.qburst.data_strucure.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by albinmathew on 9/10/14.
 */
public class TreeMapExample {
    public static void main(String args[]) {
        // Create a tree map
        TreeMap balance = new TreeMap();

        balance.put("A", 3434.34);
        balance.put("C", 123.22);
        balance.put("E", 1378.00);
        balance.put("D", 99.22);
        balance.put("B", 190.08);

        Set set = balance.entrySet();
        Iterator iterator = set.iterator();

        // Show all balances in tree map.

        while (iterator.hasNext()) {
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.println(map.getKey() + ": " +map.getValue());
        }
        System.out.println();
        // Deposit 1,000 into A's account

        double bal = ((Double) balance.get("A")).doubleValue();
        balance.put("A", new Double(bal + 1000));
        System.out.println("A's new balance: " + balance.get("A"));
    }
}
