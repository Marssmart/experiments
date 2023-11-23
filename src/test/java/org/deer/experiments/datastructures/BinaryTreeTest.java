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
    void verifyLevelOrderAllRight() {
        final var listAllRight = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final var tree = new BinaryTree(listAllRight);
        assertEquals(listAllRight, tree.levelOrder());
    }

    @Test
    void verifyLevelOrderAllLeft() {
        final var listAllLeft = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        final var tree = new BinaryTree(listAllLeft);
        assertEquals(listAllLeft, tree.levelOrder());
    }

    @Test
    void verifyLevelOrBalanced() {
        final var list = List.of(4, 2, 6, 1, 3, 5, 7);
        final var tree = new BinaryTree(list);
        assertEquals(list, tree.levelOrder());
    }
}