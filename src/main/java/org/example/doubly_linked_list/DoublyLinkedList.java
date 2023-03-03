package org.example.doubly_linked_list;

public class DoublyLinkedList {
    private DNode head;
    private DNode tail;
    private int length;

    public DoublyLinkedList(int value) {
        DNode newNode = new DNode(value, null, null);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        DNode newNode = new DNode(value, null, null);
        if (length == 0) {
            head = newNode;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }

    public void printList() {
        DNode tmp = head;

        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public boolean removeLast() {
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            DNode tmp = tail;
            tail = tail.prev;
            tail.next = null;
            tmp.prev = null;
        }
        length--;
        return true;
    }

    public void prepend(int value) {
        DNode newNode = new DNode(value, null, null);
        if (length == 0) {
            tail = newNode;
            head = newNode;
        } else {
            head = newNode;
            head.next = tail;
            tail.prev = head;
        }
        length++;
    }

    public boolean removeFirst() {
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            DNode tmp = head;
            head = head.next;
            head.prev = null;
            tmp.next = null;
        }
        length--;
        return true;
    }

    public DNode get(int index) {
        if (length == 0 || index > length) {
            return null;
        }
        DNode tmp = head;
        if (index <= length / 2) {
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
        } else {
            tmp = tail;
            for (int i = length - 1; i > index; i--) {
                tmp = tmp.prev;
            }
        }
        return tmp;
    }

    public boolean set(int index, int value) {
        if (length == 0 || index > length) {
            return false;
        }
        {
            DNode nodeToSet = get(index);
            if (nodeToSet != null) {
                nodeToSet.setValue(value);
                return true;
            }
            return false;

        }
    }
}