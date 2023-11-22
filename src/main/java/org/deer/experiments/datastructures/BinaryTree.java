package org.deer.experiments.datastructures;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

    private Node root;

    public BinaryTree() {

    }

    public BinaryTree(int[] vals) {
        for (int val : vals) {
            add(val);
        }
    }

    public BinaryTree(Collection<Integer> vals) {
        for (int val : vals) {
            add(val);
        }
    }

    public BinaryTree add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addRecursive(root, value);
        }
        return this;
    }

    private void addRecursive(Node node, int value) {
        if (node == null) {
            return;
        }

        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                addRecursive(node.left, value);
            }
            return;
        }

        if (value > node.value) {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                addRecursive(node.right, value);
            }
            return;
        }

        throw new IllegalArgumentException("Value %s already in tree".formatted(value));
    }

    public List<Integer> inOrder() {
        var list = new LinkedList<Integer>();
        inOrderRecursive(root, list);
        return list;
    }

    private void inOrderRecursive(Node node, List<Integer> collector) {
        if (node == null) {
            return;
        }
        inOrderRecursive(node.left, collector);
        collector.add(node.value);
        inOrderRecursive(node.right, collector);
    }

    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }
    }
}
