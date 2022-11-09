package com.algorithm.hashTable;

import java.util.HashSet;
import java.util.Set;

// 해시테이블 : 해시 값이 인덱스가 되도록 원래의 키 값을 저장한 배열
public class HashTable {
    // 생성자
    private int size = 1000;
    private Integer[] table;  // ???

    public HashTable() {}

    public HashTable(int size) {
        this.size = size;
    }


    // hash법 : 데이터를 저장할 위치 (인덱스)를 간단한 연산으로 구하는 것.
    public int hash(String key) {
        int askiiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            askiiSum =+ key.charAt(i);
        }
        return askiiSum % size;
    }

    public void insert(String key, Integer value) {
        int hashcode = hash(key);
        this.table[hashcode] = value;
     }

     public int search(String key) {
        return this.table[hash(key)];
     }

    public static void main(String[] args) {
        String [] names = new String[] {"name1","name2","name3","name4","name5"};
        HashTable ht = new HashTable();
        Set<Integer> nameSet = new HashSet<>();
        for (int i = 0; i < names.length; i++) {
            nameSet.add(ht.hash(names[i]));
        }
        System.out.printf("%s %s", names.length, nameSet.size());
    }
}


