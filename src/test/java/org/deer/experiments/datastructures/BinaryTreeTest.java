package org.deer.experiments.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinaryTreeTest {

    @Test
    void verifyDoesntAllowDuplicates() {
        final var tree = new BinaryTree().add(2);
        assertThrows(IllegalArgumentException.class, () -> tree.add(2));
    }

    @Test
    void verifyLevelOrder() {
        final var listInOrder = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final var tree = new BinaryTree(listInOrder);
        assertEquals(listInOrder, tree.levelOrder());
    }
}