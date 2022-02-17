package ic.doc.templatemethod;

public class TriangleNumbersSequence extends Sequence {

    @Override
    public int term(int i) {

        this.checkNegative(i);

        if (i < 1) {
            return 1;
        }
        return ((i + 1) * (i + 2)) / 2;
    }
}
