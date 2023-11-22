package org.deer.experiments.datastructures;

public class Stack<T> {

    private Node<T> root;

    public Stack<T> push(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            root = new Node<>(value, root);
        }
        return this;
    }

    public T pop() {
        if (root == null) {
            return null;
        }
        final var value = root.value;
        root = root.next;
        return value;
    }

    public int size() {
        int size = 0;
        var current = root;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    private static class Node<T> {
        private final T value;
        private final Node<T> next;

        private Node(T value) {
            this(value, null);
        }

        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
