package org.example.datastructure.binary_search_tree.queue;

public class Queue {
    QNode first;
    QNode last;
    int length;

    public Queue(int value) {
        QNode newNode = new QNode(value, null);
        this.first = newNode;
        this.last = newNode;
        length = 1;
    }

    public void printQueue() {
        QNode temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public boolean enqueue(int value) {
        QNode newNode = new QNode(value, null);
        if (length == 0) {
            this.first = newNode;
            this.last = newNode;
            length = 1;
        } else {
            QNode temp = last;
            last = newNode;
            temp.next = last;
            length++;
        }
        return true;
    }

    public boolean dequeue() {
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            first = null;
            last = null;
            return true;
        }
        QNode temp = first;
        first = first.next;
        temp.next = null;
        length--;
        return true;
    }

}
