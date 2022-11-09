package com.algorithm.hashTable;

public class ChainHash<K,V> {

    private int size;
    private Node<K,V>[] table;

    public ChainHash(int size) {
        try {
            table = new Node[size];
            this.size = size;
        } catch (OutOfMemoryError e) {
            this.size = 0 ; // 용량초과시 테이블 생성 불가, 해시테이블을 크게 하면 충돌은 억제하나 메모리를 많이 차지함
        }                   // 시간과 공간의 절충
    }
    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    class Node<K,V> {
        private K key;
        private V value;
        private Node<K,V> next; // 다음 노드에 대한 참조 (자기참조형 class)
        // 생성자
        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
        // Node<K,V>의 세가지 메서드 getkey(), getData(), hashcode()
        K getKey() {
            return key;
        }
        V getValue() {
            return value;
        }
        public int hashCode() {    // 객체의 해시코드: 객체의 주소값을 기준으로 정수 반환
            return key.hashCode();    // key의 해시 값 반환
        }
    }

    public V search(K key) {
        int hash = hashValue(key);  // 검색 할 데이터의 해시 값
        Node<K,V> p = table[hash];  // 선택 노드
        while ( p != null) {
            if (p.getKey().equals(key))
                return p.getValue();  // 검색성공
            p = p.next;             // 다음 노드로
        }
        return null;                  // 검색실패
    }

    public int add(K key, V value) {
        int hash = hashValue(key);
        Node<K,V> p = table[hash];

return 0;
    }
}
