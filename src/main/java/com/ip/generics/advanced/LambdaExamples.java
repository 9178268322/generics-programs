package com.ip.generics.advanced;

import com.ip.generics.collections.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class LambdaExamples {

    public Map<Boolean, List<Person>> getOldAndYoungPeople(final Person[] people, int age) {
        List<Person> personList = new ArrayList<>();
        for (Person person : people) {
            personList.add(person);
        }
        Map<Boolean, List<Person>> oldAndYoungPeople = personList.stream().
                collect(partitioningBy(person -> person.getAge() > age));
        return oldAndYoungPeople;
    }
}
