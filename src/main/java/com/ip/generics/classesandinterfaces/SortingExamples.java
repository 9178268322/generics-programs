package com.ip.generics.classesandinterfaces;

import com.ip.generics.collections.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is used to sort persons
 * by their age.
 */
public class SortingExamples {

    public List<Person> getSortedPersonByAge(final Person[] people) {
            List<Person> personList = new ArrayList<>();
            for (Person person : people) {
                personList.add(person);
            }
            Collections.sort(personList, new AgeComparator());
            return personList;
    }

    public List<Person> getReverseSortedPersonByAge(final Person[] people) {
        List<Person> personList = new ArrayList<>();
        for (Person person : people) {
            personList.add(person);
        }
        Collections.sort(personList, new ReverseComparator<>(new AgeComparator()));
        return personList;
    }
}
