package com.algorithm.hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTableSolution {
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    // 칸 마다 list를 만들어 준다.
    List<Node>[] table = new ArrayList[1000];

    // hash 함수
    public int hash(String key) {
        int askiiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            askiiSum =+ key.charAt(i);
        }
        return askiiSum % 1000;
    }

    public void insert(String key, Integer value) { // key와 value를 같이 넣는다.
        // List
        int hashcode = hash(key);
        if(this.table[hashcode] == null) {
            this.table[hashcode] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashcode].add(new Node(key, value));
     }

     public Integer search(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes ) {
            if(key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
     }

    public static void main(String[] args) {

    }
}


