package ic.doc.templatemethod;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class TriangleNumbersSequenceTests {

    final TriangleNumbersSequence sequence = new TriangleNumbersSequence();

    @Test
    public void definesFirstTermToBeOne() {

        assertThat(sequence.term(0), is(1));
    }

    @Test
    public void definesSubsequentTermsToBeTheSumOfThePreviousTwo() {
        assertThat(sequence.term(1), is(3));
        assertThat(sequence.term(2), is(6));
        assertThat(sequence.term(3), is(10));
    }
}