package org.example.hashtable;

public class HashNode {
    String key;
    int value;
    HashNode next;

    public HashNode(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashNode{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
