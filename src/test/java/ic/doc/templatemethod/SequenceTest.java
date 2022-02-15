package ic.doc.templatemethod;

import org.junit.Test;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

public class SequenceTest {

    final Sequence sequence = new Sequence() {
        // Created anonymous on the fly concrete implementation of sequence
        @Override
        public int term(int i) {
            return i;
        }
    };

    @Test
    public void isUndefinedForNegativeIndices() {

        try {
            sequence.checkNegative(-1);
            fail("should have thrown exception");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
        }
    }

    @Test
    // Testing sequence itself, that it can be iterated through rather than the values themselves
    public void canBeIteratedThrough() {
        assertThat(sequence, beginsWith(0, 1, 2, 3, 4));
    }

}
