package ic.doc.strategy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleNumbersSequenceTests {

    final TriangleNumbersSequence sequence = new TriangleNumbersSequence();

    @Test
    public void definesFirstTwoTermsToBeOne() {

        assertThat(sequence.term(0), is(1));
    }

    @Test
    public void definesSubsequentTermsToBeTheSumOfThePreviousTwo() {

        assertThat(sequence.term(1), is(3));
        assertThat(sequence.term(2), is(6));
        assertThat(sequence.term(3), is(10));
    }
}