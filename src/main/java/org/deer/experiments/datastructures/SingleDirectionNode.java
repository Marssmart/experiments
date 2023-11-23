package org.deer.experiments.datastructures;


class SingleDirectionNode<T> {
    private final T value;
    private SingleDirectionNode<T> next;

    SingleDirectionNode(T value) {
        this(value, null);
    }

    SingleDirectionNode(T value, SingleDirectionNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public SingleDirectionNode<T> getNext() {
        return next;
    }

    public void setNext(SingleDirectionNode<T> next) {
        this.next = next;
    }
}
