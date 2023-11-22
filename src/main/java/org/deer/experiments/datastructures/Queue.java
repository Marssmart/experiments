package org.deer.experiments.datastructures;

/**
 * pop() and size() logic is identical with Stack so in this case we can just override push
 */
public class Queue<T> extends Stack<T> {

    @Override
    public Stack<T> push(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            var current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(value);
        }
        return this;
    }
}
