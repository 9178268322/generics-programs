package com.ip.generics.wildcards.bounded;

/**
 * This is a sub class of person.
 */
public class Partner extends Person {

    public Partner(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Partner{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
