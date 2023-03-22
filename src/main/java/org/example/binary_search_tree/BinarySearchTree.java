package org.example.binary_search_tree;

public class BinarySearchTree {
    private BstNode root;


    public boolean insert(int value) {
        if (root == null) {
            root = new BstNode(value, null, null);
            return true;
        }
        BstNode find = lookUp(value);
        if (find.value == value) {
            return false;
        } else if (find.value > value) {
            find.left = new BstNode(value, null, null);
            return true;
        } else {
            find.right = new BstNode(value, null, null);
            return true;
        }
    }

    public BstNode lookUp(int value) {
        BstNode temp = root;
        while (temp != null) {
            if (temp.value > value) {
                if (temp.left == null) {
                    return temp;
                } else {
                    temp = temp.left;

                }

            } else {
                if (temp.right == null) {
                    temp.right = new BstNode(value, null, null);
                    return temp;
                } else {
                    temp = temp.right;
                }
            }
        }
        return null;
    }
}





