import java.util.*;

class MyHashMap {

    static class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private int SIZE = 10;
    private Node[] table;

    public MyHashMap() {
        table = new Node[SIZE];
    }

    // hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // put(key, value)
    public void put(int key, int value) {
        int idx = hash(key);
        Node head = table[idx];

        // update if key exists
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.key == key) {
                cur.value = value;
                return;
            }
        }

        // insert at head
        Node newNode = new Node(key, value);
        newNode.next = head;
        table[idx] = newNode;
    }

    // get(key)
    public int get(int key) {
        int idx = hash(key);
        for (Node cur = table[idx]; cur != null; cur = cur.next) {
            if (cur.key == key)
                return cur.value;
        }
        return -1; // not found
    }

    // remove(key)
    public void remove(int key) {
        int idx = hash(key);
        Node cur = table[idx], prev = null;

        while (cur != null) {
            if (cur.key == key) {
                if (prev == null)
                    table[idx] = cur.next;
                else
                    prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
}

public class TestHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(11, 20);
        map.put(2, 30);

        System.out.println(map.get(1));
        System.out.println(map.get(11));

        map.remove(1);
        System.out.println(map.get(1));
    }
}