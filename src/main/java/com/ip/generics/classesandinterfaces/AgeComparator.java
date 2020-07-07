package com.ip.generics.classesandinterfaces;

import com.ip.generics.collections.Person;

import java.util.Comparator;

/**
 * This is a age comparator which compares person's age
 * in sorting order.
 */
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(final Person left, final Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
