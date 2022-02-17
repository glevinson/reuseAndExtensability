package ic.doc.templatemethod;

public class FibonacciSequence extends Sequence {

    @Override
    public int term(int i) {
        this.checkNegative(i);

        if (i < 2) {
            return 1;
        }
        return term(i - 1) + term(i - 2);
    }
}
