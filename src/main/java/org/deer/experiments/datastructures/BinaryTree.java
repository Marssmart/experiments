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
        root = addRecursive(root, value);
        return this;
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            throw new IllegalArgumentException("Value %s already exists in tree".formatted(value));
        }

        return current;
    }

    public List<Integer> levelOrder() {
        var list = new LinkedList<Integer>();
        Queue<Node> queue = new Queue<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            var current = queue.pop();
            list.add(current.value);
            if (current.left != null) {
                queue.push(current.left);
            }
            if (current.right != null) {
                queue.push(current.right);
            }
        }
        return list;
    }

    public int size() {
        var size = 0;
        Queue<Node> queue = new Queue<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            var current = queue.pop();
            size++;
            if (current.left != null) {
                queue.push(current.left);
            }
            if (current.right != null) {
                queue.push(current.right);
            }
        }
        return size;
    }

    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }

        public boolean isFull() {
            return left != null & right != null;
        }
    }
}
