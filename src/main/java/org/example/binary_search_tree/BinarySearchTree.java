package org.example.binary_search_tree;

public class BinarySearchTree {
    private BstNode root;


    public BstNode insert(int value) {
        if (root == null) {
            return root = new BstNode(value, null, null);
        }
        return insert(root, value);
    }

    private BstNode insert(BstNode currentNode, int value) {
        if (currentNode == null) {
            return new BstNode(value, null, null);
        }
        if (currentNode.value < value) {
            currentNode.right = insert(currentNode.right, value);
        } else if (currentNode.value > value) {
            currentNode.left = insert(currentNode.left, value);
        }
        return currentNode;

    }

    public boolean contains(int value) {
        BstNode currentNode = root;
        return contains(currentNode, value);
    }

    private boolean contains(BstNode currentNode, int value) {
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;
        if (value > currentNode.value) {
            return contains(currentNode.right, value);
        } else {
            return contains(currentNode.left, value);
        }
    }
}





