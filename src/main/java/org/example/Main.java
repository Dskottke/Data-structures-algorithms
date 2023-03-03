package org.example;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList(4);
        list.append(5);
        list.append(6);
        list.reverse();
        list.printList();
    }
}
