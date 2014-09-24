package com.qburst.data_strucure.bitset;

import java.util.BitSet;

/**
 * Created by albin on 24/9/14.
 */
public class BitSetExample {

    public static void main(String args[]) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        for (int i = 0; i < 32; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println("Elements in bits1: "+ bits1);
        System.out.println("Elements in bits2: "+ bits2);

        // FLIPPING
        bits2.flip(2);
        System.out.println("bits2 flipped at 2 "+bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("bits2 AND bits1: "+bits2);

        // AND NOT bits
        bits2.andNot(bits1);
        System.out.println("bits2 andNot bits1: "+bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("bits2 OR bits1: "+bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("bits2 XOR bits1: "+bits2);


    }
}