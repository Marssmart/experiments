package org.deer.experiments.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueTest {

    @Test
    void verify() {
        final var queue = new Queue<Integer>();
        assertEquals(4, queue.push(4).push(7).push(2).pop());
        assertEquals(2, queue.size());
        assertEquals(7, queue.push(2).push(3).pop());
        assertEquals(3, queue.size());
    }
}