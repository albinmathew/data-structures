package com.qburst.data_strucure.binary_tree;

/**
 * Created by albinmathew on 7/10/14.
 */
public class BinaryTreeExample {
    public static void main(String[] args) {

        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        insert(root, 1);
        insert(root, 4);
        insert(root, 8);
        insert(root, 6);
        insert(root, 3);
        insert(root, 9);
        System.out.println("Traversing tree in order");
        printInOrder(root);
        System.out.println("Traversing tree front-to-back from location 7");
        printFrontToBack(root, 7);
    }

    public static void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of "
                        + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }

    public static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println("  Traversed " + node.value);
            printInOrder(node.right);
        }
    }

    /**
     * uses in-order traversal when the origin is less than the node's value
     *
     * uses reverse-order traversal when the origin is greater than the node's
     * order
     */
    public static  void printFrontToBack(Node node, int val) {
        if (node == null)
            return;
        if (node.value > val) {
            // print in order
            printFrontToBack(node.left, val);
            System.out.println("  Traversed " + node.value);
            printFrontToBack(node.right, val);
        } else if (node.value < val) {
            // print reverse order
            printFrontToBack(node.right, val);
            System.out.println("  Traversed " + node.value);
            printFrontToBack(node.left, val);
        } else {
            // order doesn't matter
            printFrontToBack(node.left, val);
            printFrontToBack(node.right, val);
        }
    }

}
