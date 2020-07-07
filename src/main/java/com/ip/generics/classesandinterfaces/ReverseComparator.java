package com.ip.generics.classesandinterfaces;

import java.util.Comparator;

/**
 * This is a comparator which reverses sorted persons
 * based on age.
 * @param <T> tag.
 */
public class ReverseComparator<T> implements Comparator<T> {

    private final transient Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(final T left, final T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}
