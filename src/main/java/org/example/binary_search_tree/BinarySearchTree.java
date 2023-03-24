package org.example.binary_search_tree;

public class BinarySearchTree {
    private BstNode root;


    public boolean insert(int value) {
        BstNode newNode = new BstNode(value, null, null);
        if (root == null) {
            root = newNode;
            return true;
        }
        BstNode temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        BstNode temp = root;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return false;
    }
}





