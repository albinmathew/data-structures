package com.qburst.data_strucure.set.enum_set;

import java.util.EnumSet;

/**
 * Created by albinmathew on 20/10/14.
 */
public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet largeSize = EnumSet.of(  Size.S, Size.M, Size.L,Size.XL, Size.XXL, Size.XXXL);
        for (Object aLargeSize : largeSize) {
            Size size = (Size) aLargeSize;
            System.out.println(size);
        }
    }
}
