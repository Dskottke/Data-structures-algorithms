package org.example.datastructure.doubly_linked_list;

public class DNode {
    int value;
    DNode prev;
    DNode next;

    public DNode(int value, DNode next, DNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
