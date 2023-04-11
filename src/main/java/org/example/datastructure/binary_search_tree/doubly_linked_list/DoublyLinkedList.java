package org.example.datastructure.binary_search_tree.doubly_linked_list;

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

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;

        }
        DNode newNode = new DNode(value, null, null);
        DNode before = get(index - 1);
        DNode after = before.next;
        before.next = newNode;
        after.prev = newNode;
        newNode.prev = before;
        newNode.next = after;
        length++;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            removeFirst();
            return true;
        }
        if (index == length) {
            removeLast();
            return true;
        }
        DNode nodeToDelete = get(index);
        DNode next = nodeToDelete.next;
        DNode before = nodeToDelete.prev;
        before.next = next;
        next.prev = before;
        nodeToDelete.prev = null;
        nodeToDelete.next = null;
        length--;
        return true;

    }
}