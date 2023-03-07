package org.example;

import org.example.doubly_linked_list.DoublyLinkedList;
import org.example.linked_list.LinkedList;
import org.example.queue.Queue;
import org.example.stack.Stack;

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
    }
}
