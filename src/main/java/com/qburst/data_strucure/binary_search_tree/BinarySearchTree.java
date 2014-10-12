package com.qburst.data_strucure.binary_search_tree;

/**
 * Created by albinmathew on 12/10/14.
 */
public class BinarySearchTree {

    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        for (int i = 0; i < 50; i++) {
            binarySearchTree.insert(i);
        }
        binarySearchTree.printTree();
        Comparable max = binarySearchTree.findMax();
        Comparable min = binarySearchTree.findMin();
        System.out.println("Max : " + max + " Min : " + min);
        System.out.println();


        /**
         * testing the search tree
         */

        BinarySearchTree t = new BinarySearchTree();
        final int NUMS = 4000;
        final int GAP = 51;

        for (int i = GAP; i != 0; i = (i + GAP) % NUMS)
            t.insert(new Integer(i));

        t.printTree();

        for (int i = 1; i < NUMS; i += 2)
            t.remove(new Integer(i));

        t.printTree();

        if ((Integer) t.findMin() != 2 || (Integer) t.findMax() != NUMS - 2)
            System.out.println("FindMin or FindMax error!");

        for (int i = 2; i < NUMS; i += 2) {
            if ((Integer) t.find(i) != i) System.out.println("Find error1!");
        }

        for (int i = 1; i < NUMS; i += 2) {
            if (t.find(i) != null) System.out.println("Find error2!");
        }
    }


    public void insert(Comparable x) {
        root = insert(x, root);
    }


    public void remove(Comparable x) {
        root = remove(x, root);
    }


    public Comparable findMin() {
        return elementAt(findMin(root));
    }


    public Comparable findMax() {
        return elementAt(findMax(root));
    }

    public Comparable find(Comparable x) {
        return elementAt(find(x, root));
    }


    public void makeEmpty() {
        root = null;
    }


    public boolean isEmpty() {
        return root == null;
    }


    public void printTree() {
        if (isEmpty())
            System.out.println("Empty tree");
        else
            printTree(root);
    }


    private Comparable elementAt(BinaryNode t) {
        return t == null ? null : t.element;
    }


    private BinaryNode insert(Comparable x, BinaryNode t) {

        if (t == null)
            t = new BinaryNode(x, null, null);

        else if (x.compareTo(t.element) < 0)
            t.left = insert(x, t.left);

        else if (x.compareTo(t.element) > 0)
            t.right = insert(x, t.right);

        return t;
    }


    private BinaryNode remove(Comparable x, BinaryNode t) {
        if (t == null)
            return t;
        if (x.compareTo(t.element) < 0)
            t.left = remove(x, t.left);
        else if (x.compareTo(t.element) > 0)
            t.right = remove(x, t.right);
        else if (t.left != null && t.right != null) {
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        } else
            t = (t.left != null) ? t.left : t.right;
        return t;
    }

    private BinaryNode findMin(BinaryNode t) {
        if (t == null)
            return null;
        else if (t.left == null)
            return t;
        return findMin(t.left);
    }


    private BinaryNode findMax(BinaryNode t) {
        if (t != null)
            while (t.right != null)
                t = t.right;

        return t;
    }

    private BinaryNode find(Comparable x, BinaryNode t) {
        if (t == null)
            return null;
        if (x.compareTo(t.element) < 0)
            return find(x, t.left);
        else if (x.compareTo(t.element) > 0)
            return find(x, t.right);
        else
            return t;
    }


    private void printTree(BinaryNode t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        }
    }
}
