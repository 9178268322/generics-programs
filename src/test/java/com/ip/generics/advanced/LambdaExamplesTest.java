package com.ip.generics.advanced;

import com.ip.generics.collections.Person;
import org.testng.annotations.BeforeTest;

public class LambdaExamplesTest {

    private static LambdaExamples lambdaExamples;

    private static final Person DON_DRAPER = new Person("Don Draper", 89);
    private static final Person PEGGY_OLSON = new Person("Peggy Olson", 75);
    private static final Person BERT_COOPER = new Person("Bert Cooper", 100);

    @BeforeTest
    public void init() {
        lambdaExamples = new LambdaExamples();
    }
}
