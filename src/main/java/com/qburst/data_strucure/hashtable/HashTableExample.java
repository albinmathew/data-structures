package com.qburst.data_strucure.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by albinmathew on 6/10/14.
 */
public class HashTableExample {
    public static void main(String args[]) {
        // Create a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("A", 3434.34);
        balance.put("B", 123.22);
        balance.put("C", 1378.00);
        balance.put("D", 99.22);
        balance.put("E", 190.08);

        // Show all balances in hash table.
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " +
                    balance.get(str));
        }
        System.out.println();
        // Deposit 1,000 into A's account
        bal = ((Double) balance.get("A")).doubleValue();
        balance.put("A", new Double(bal + 1000));
        System.out.println("A's new balance: " + balance.get("A"));
    }
}
