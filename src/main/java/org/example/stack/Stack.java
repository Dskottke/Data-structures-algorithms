package org.example.stack;

public class Stack {
    int value;
    SNode top;
    int height;

    public Stack(int value) {
        top = new SNode(value, null);
        height = 1;
    }

    public void printStack() {
        SNode tmp = top;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public boolean push(int value) {
        if (height == 0) {
            top = new SNode(value, null);
            height = 1;
        } else {
            top = new SNode(value, top);
            height++;
        }
        return true;
    }

    public boolean pop() {
        if (height == 0) {
            return false;
        }
        SNode tmp = top;
        top = top.next;
        tmp.next = null;
        height--;
        return true;
    }
}

