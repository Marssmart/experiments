package org.deer.experiments.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {

    @Test
    void verify() {
        var stack = new Stack<Integer>();
        assertEquals(0, stack.size());
        stack.push(2).push(7);
        assertEquals(2, stack.size());
        assertEquals(7, stack.pop());
        assertEquals(1, stack.size());
        assertEquals(10, stack.push(4).push(2).push(10).pop());
        assertEquals(3, stack.size());
    }
}