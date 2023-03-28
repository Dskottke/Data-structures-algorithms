package org.example;

import org.example.binary_search_tree.BinarySearchTree;
import org.example.doubly_linked_list.DoublyLinkedList;
import org.example.graph.Graph;
import org.example.hashtable.HashNode;
import org.example.hashtable.HashTable;
import org.example.linked_list.LinkedList;
import org.example.queue.Queue;
import org.example.stack.Stack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---linked-list---");
        LinkedList list = new LinkedList(4);
        list.append(5);
        list.append(6);
        list.reverse();
        list.printList();

        System.out.println("---doubly-linked-list---");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(5);
        doublyLinkedList.append(12);
        doublyLinkedList.insert(1, 100);
        doublyLinkedList.remove(1);
        doublyLinkedList.printList();

        System.out.println("---stack---");
        Stack stack = new Stack(4);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.printStack();

        System.out.println("---queue---");
        Queue queue = new Queue(5);
        queue.enqueue(4);
        queue.dequeue();
        queue.printQueue();

        System.out.println("---binary-search-tree---");
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(9);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(10);
        binarySearchTree.insert(22);
        binarySearchTree.insert(23);
        System.out.println(binarySearchTree.contains(11));

        System.out.println("---HashTable---");
        HashTable hashTable = new HashTable();
        hashTable.set("nails",1000);
        hashTable.set("tile",50);
        hashTable.set("lumber",80);
        hashTable.set("bolts",200);
        hashTable.set("screws",140);
        hashTable.printTable();
        List<String> hashNodes = hashTable.keys();
        System.out.println(hashNodes);
        System.out.println(hashTable.get("lumber"));

        System.out.println("---Graph---");
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("A","D");
        graph.addEdge("C","D");
        graph.addEdge("B","D");
        graph.printGraph();
        graph.removeVertex("D");
        graph.printGraph();
    }
}
