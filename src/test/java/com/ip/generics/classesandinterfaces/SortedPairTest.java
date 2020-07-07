package com.ip.generics.classesandinterfaces;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test
 * functions of SortedPair class.
 */
public class SortedPairTest {

    @Test
    public void shouldRetainOrderOfOrderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(1, 2);
        assertThat(pair.getFirst().intValue()).isEqualTo(1);
        assertThat(pair.getSecond().intValue()).isEqualTo(2);
    }

    @Test
    public void shouldFlipOrderOfMisorderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(2, 1);
        assertThat(pair.getFirst().intValue()).isEqualTo(1);
        assertThat(pair.getSecond().intValue()).isEqualTo(2);
    }
}
