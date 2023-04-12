package org.example.datastructure.binary_search_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;

    public BstNode deleteNode(int value) {
        return deleteNode(root, value);
    }

    public BstNode deleteNode(BstNode currentNode, int value) {
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    private int minValue(BstNode currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

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

    public ArrayList<Integer> BFS() {
        BstNode currentNode = root;
        Queue<BstNode> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }

        }
        return results;
    }
}





