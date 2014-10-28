package com.qburst.data_strucure.bplus_tree;

/**
 * Created by albinmathew on 28/10/14.
 */
public class Node {
    private static final int T = 4;
    public int mNumKeys = 0;
    public int[] mKeys = new int[2 * T - 1];
    public Object[] mObjects = new Object[2 * T - 1];
    public Node[] mChildNodes = new Node[2 * T];
    public boolean mIsLeafNode;
    public Node mNextNode;
}
