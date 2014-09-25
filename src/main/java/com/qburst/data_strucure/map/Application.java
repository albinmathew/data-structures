package com.qburst.data_strucure.map;

/**
 * Created by albin on 25/9/14.
 */
public class Application {
    public static  void main(String[] args){
        Map<String, Integer> map = new Map<String, Integer>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three",3);

        System.out.println(map.get("three"));

        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), i);
        }


        for (int i = 0; i < 100; i++) {
            System.out.println(map.get(String.valueOf(i)));
        }
    }
}
