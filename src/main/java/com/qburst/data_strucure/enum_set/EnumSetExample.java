package com.qburst.data_strucure.enum_set;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by albinmathew on 20/10/14.
 */
public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet largeSize = EnumSet.of(  Size.S, Size.M, Size.L,Size.XL, Size.XXL, Size.XXXL);
        for(Iterator it = largeSize.iterator();it.hasNext();){
            Size size = (Size)it.next();
            System.out.println(size);
        }
    }
}
