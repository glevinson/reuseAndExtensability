package ic.doc.strategy;

import java.util.Iterator;

public class Sequence implements Iterable<Integer>, Mapping {

    private final Mapping map;

    public Sequence(Mapping map) {
        this.map = map;
    }

    // This should never be called but still have hear to comply with the interface
    public int term(int i) {

        checkNegative(i);
        int answer = map.term(i);

        return answer;
    }

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
