package com.qburst.data_strucure.cartesiantree;

/**
 * Created by albinmathew on 8/10/14.
 */
public class CartesianTree {
    private Node root;

    /* Constructor */
    public CartesianTree(int[] data)
    {
        root = build(data);
    }
    /* Function to build Cartesian Tree from array */
    public Node build(int[] data)
    {
        if (data == null || data.length == 0)
            return null;
        return build(data, 0, data.length - 1);
    }
    /* Function to build Cartesian Tree from array */
    private Node build(int[] data, int start, int end)
    {
        if (end < start)
            return null;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = start; i <= end; i++)
        {
            if (data[i] < min)
            {
                min = data[i];
                minIndex = i;
            }
        }
        Node node = new Node();
        node.value = min;
        node.left = build(data, start, minIndex - 1);
        node.right = build(data, minIndex + 1, end);
        return node;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    private int countNodes(Node r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
    /* Function for inorder traversal */
    public void inOrder()
    {
        inOrder(root);
    }
    private void inOrder(Node r)
    {
        if (r != null)
        {
            inOrder(r.left);
            System.out.print(r.value +" ");
            inOrder(r.right);
        }
    }
    /* Function for preorder traversal */
    public void preOrder()
    {
        preOrder(root);
    }
    private void preOrder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.value +" ");
            preOrder(r.left);
            preOrder(r.right);
        }
    }
    /* Function for postorder traversal */
    public void postOrder()
    {
        postOrder(root);
    }
    private void postOrder(Node r)
    {
        if (r != null)
        {
            postOrder(r.left);
            postOrder(r.right);
            System.out.print(r.value +" ");
        }
    }
}
