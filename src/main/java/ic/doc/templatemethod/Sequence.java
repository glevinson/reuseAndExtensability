package ic.doc.templatemethod;

import java.util.Iterator;

public abstract class Sequence implements Iterable<Integer> {

    // This should never be called but still have hear to comply with the interface
    public abstract int term(int i);

    public void checkNegative(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
    }

    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return term(index++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
