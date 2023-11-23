package org.deer.experiments.datastructures;

/**
 * pop() and size() logic is identical with Stack so in this case we can just override push
 */
public class Queue<T> extends Stack<T> {

    @Override
    public Stack<T> push(T value) {
        if (root == null) {
            root = new SingleDirectionNode<>(value);
        } else {
            var current = root;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new SingleDirectionNode<>(value));
        }
        return this;
    }
}
