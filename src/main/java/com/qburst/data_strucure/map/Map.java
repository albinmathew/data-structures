package com.qburst.data_strucure.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by albin on 25/9/14.
 */
public class Map <K,V> {
    private int size;
    private int DEFAULT_CAPACITY = 16;
    @SuppressWarnings("unchecked")
    private Entry<K, V>[] values = new Entry[DEFAULT_CAPACITY];


    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }
        if (insert) {
            ensureCapa();
            values[size++] = new Entry<K, V>(key, value);
        }
    }

    private void ensureCapa() {
        if (size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i] = null;
                size--;
                condenseArray(i);
            }
        }
    }

    private void condenseArray(int start) {
        for (int i = start; i < size; i++) {
            values[i] = values[i + 1];
        }
    }

    public Set<K> keySet() {
        Set<K> set = new HashSet<K>();
        for (int i = 0; i < size; i++) {
            set.add(values[i].getKey());
        }
        return set;
    }

    public boolean containsKey(V word) {
        boolean contains = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(word)) {
//                values[i].setValue(word);
                contains = false;
            }
        }
        return contains;
    }
}