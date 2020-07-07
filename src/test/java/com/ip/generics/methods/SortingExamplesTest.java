package com.ip.generics.methods;

import com.ip.generics.collections.Person;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * This test class is used to
 * test functions of SortingExamples class.
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
    public void testYoungestMember() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COOPER};
        assertThat(sortingExamples.getYoungestMember(people)).isEqualTo(PEGGY_OLSON);
    }

    @Test
    public void testYoungestMemberWithEmpty() {
        Person[] people = {};
        assertThatIllegalArgumentException().isThrownBy(() -> sortingExamples.getYoungestMember(people));
    }

    @Test
    public void testYoungestMemberWithNull() {
        Person[] people = null;
        assertThatIllegalArgumentException().isThrownBy(() -> sortingExamples.getYoungestMember(people));
    }

    @Test
    public void testYoungestMemberWithOnePerson() {
        Person[] people = {DON_DRAPER};
        assertThat(sortingExamples.getYoungestMember(people)).isEqualTo(DON_DRAPER);
    }

    @Test
    public void testYoungestMemberWithSpace() {
        Person[] people = { };
        assertThatIllegalArgumentException().isThrownBy(() -> sortingExamples.getYoungestMember(people));
    }

    @Test
    public void testYoungestMemberWithTabSpace() {
        Person[] people = { };
        assertThatIllegalArgumentException().isThrownBy(() -> sortingExamples.getYoungestMember(people));
    }
}
