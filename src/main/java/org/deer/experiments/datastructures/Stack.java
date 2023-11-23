package org.deer.experiments.datastructures;

public class Stack<T> {

    protected SingleDirectionNode<T> root;

    public Stack<T> push(T value) {
        if (root == null) {
            root = new SingleDirectionNode<>(value);
        } else {
            root = new SingleDirectionNode<>(value, root);
        }
        return this;
    }

    public T pop() {
        if (root == null) {
            return null;
        }
        final var value = root.getValue();
        root = root.getNext();
        return value;
    }

    public int size() {
        int size = 0;
        var current = root;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}
