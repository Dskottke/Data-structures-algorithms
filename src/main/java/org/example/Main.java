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
      doublyLinkedList.append(5);
      doublyLinkedList.append(12);
      doublyLinkedList.insert(1,100);
      doublyLinkedList.remove(1);
      doublyLinkedList.printList();
    }
}
