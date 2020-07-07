package com.ip.generics.methods;

import com.ip.generics.classesandinterfaces.AgeComparator;
import com.ip.generics.collections.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * In this class we are applying generic concept
 * at method level.
 */
public class SortingExamples {

    public Person getYoungestMember(final Person[] people) {
        if (people == null) {
            throw new IllegalArgumentException("Person array can't be null");
        }
        List<Person> personList = new ArrayList<>();
        for (Person person : people) {
            personList.add(person);
        }
        return min(personList, new AgeComparator());
    }

    public static <T> T min(List<T> values, Comparator<T> comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("Unable to find the minimum of an empty list");
        }

        T lowestFound = values.get(0);

        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);
            if (comparator.compare(element, lowestFound) < 0) {
                lowestFound = element;
            }
        }
        return lowestFound;
    }
}
