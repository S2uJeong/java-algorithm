package com.algorithm;

import java.util.EmptyStackException;

public class Stack02 {

    private int top;
    private Integer[] arr;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push (int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[top] = value;
        this.top ++;
    }

    public int pop() {
      if (this.isEmpty()) {
          throw new RuntimeException("스택이 비었습니다.");
      }
      return this.arr[--this.top]; // this.top = 2
    }

    public boolean isEmpty() {
       boolean isEmpty = this.top == 0;
       return isEmpty;
    }

    public int peek() {
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[this.top-1];
    }




}
