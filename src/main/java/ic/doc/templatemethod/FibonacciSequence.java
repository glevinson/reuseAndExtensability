package ic.doc.templatemethod;

// Everytime you imp-lement an interface you must implement thhe respective methods in some wqay
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
