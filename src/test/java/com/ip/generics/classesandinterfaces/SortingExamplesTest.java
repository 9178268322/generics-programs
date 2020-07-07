package com.ip.generics.classesandinterfaces;

import com.ip.generics.collections.Person;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used
 * to test functions of SortingExamples class.
 */
public class SortingExamplesTest {

    private static SortingExamples sortingExamples;

    private static final Person DON_DRAPER = new Person("Don Draper", 89);
    private static final Person PEGGY_OLSON = new Person("Peggy Olson", 65);
    private static final Person BERT_COOPER = new Person("Bert Cooper", 100);

    @BeforeTest
    public void init() {
        sortingExamples = new SortingExamples();
    }

    @Test
    public void tesSortedPersonByAge() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COOPER};
        assertThat(sortingExamples.getSortedPersonByAge(people)).containsExactly(PEGGY_OLSON, DON_DRAPER, BERT_COOPER);
    }

    @Test
    public void tesReverseSortedPersonByAge() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COOPER};
        assertThat(sortingExamples.getReverseSortedPersonByAge(people)).containsExactly(BERT_COOPER, DON_DRAPER, PEGGY_OLSON);
    }
}
