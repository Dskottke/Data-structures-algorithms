package org.example.datastructure.binary_search_tree.hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable {
    private final int size = 7;
    private final HashNode[] dataMap;

    public HashTable() {
        dataMap = new HashNode[size];
    }

    public void set(String key, int value) {
        int index = hash(key);
        HashNode newNode = new HashNode(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            HashNode temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newNode;
        }
    }

    public HashNode get(String key) {
        int index = hash(key);
        HashNode node = dataMap[index];
        if (node.next == null && Objects.equals(node.key, key)) {
            return node;
        } else {
            while (node != null) {
                if (Objects.equals(node.key, key)) {
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }


    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            HashNode temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {

        char[] keyChars = key.toCharArray();
        int hash = 0;
        for (int asciiValue : keyChars) {
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public List<String> keys() {
        List<String> allKeys = new ArrayList<>();
        for (HashNode node : dataMap) {
            if (node != null) {
                allKeys.add(node.key);
                while (node.next != null) {
                    node = node.next;
                    allKeys.add(node.key);
                }
            }
        }
        return allKeys;
    }

}

