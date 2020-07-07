package com.ip.generics.classesandinterfaces;

/**
 * This is a in bound sorted class which extend
 * from Comparable.
 * @param <T>
 */
public class SortedPair<T extends Comparable<T>> {

    private final transient T first;
    private final transient T second;

    public SortedPair(T left, T right) {
        if (left.compareTo(right) < 0) {
            first = left;
            second = right;
        } else {
            first = right;
            second = left;
        }
    }

    public T getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }
}
