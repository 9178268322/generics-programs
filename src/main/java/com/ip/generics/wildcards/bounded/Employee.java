package com.ip.generics.wildcards.bounded;

/**
 * This is a sub class of person.
 */
public class Employee extends Person {

    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
