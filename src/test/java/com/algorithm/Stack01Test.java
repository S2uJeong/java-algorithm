package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @Test
    @DisplayName("push pop 작동확인")
    void pushAndPop() {
        Stack01 stack = new Stack01();
        stack.push(10);
        stack.push(20);

        Assertions.assertEquals(20,stack.pop());
        Assertions.assertEquals(10,stack.pop());
    }





}