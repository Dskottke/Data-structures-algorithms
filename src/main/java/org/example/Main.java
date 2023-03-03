package org.example;

import org.example.doubly_linked_list.DoublyLinkedList;
import org.example.linked_list.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList(4);
        list.append(5);
        list.append(6);
        list.reverse();


        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.removeFirst();
        System.out.println(doublyLinkedList.set(0, 5));
    }
}
