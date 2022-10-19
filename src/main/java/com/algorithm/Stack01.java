package com.algorithm;

public class Stack01 {

    private int[] arr = new int[1000];

    private int pointer = 0;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
       this.arr[this.pointer] = value;
       this.pointer++;
    }

    public int pop() {
        int value = this.arr[this.pointer - 1];
        pointer--;
        return value;
    }

    public int[] getArr() {
        return arr;
    }
}
