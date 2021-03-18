import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements Iterator<Integer> {
    private Integer number;
    private Integer next;
    Iterator<Integer> itr;
//    private int count;
//    private int index;

    public MyIterator(Collection<Integer> collection) {
        itr = collection.iterator();
    }

    @Override
    public boolean hasNext() {
//        while (itr.hasNext()) {
//            if (next != null && next % 2 == 0) {
//                number = next;
//            }
//            if ((next = itr.next()) != null && (next % 2 == 0 || number % 2 == 0)) {
//                return true;
//            }
//            return  (number = itr.next()) != null;
//        }
//        return false;

        while (itr.hasNext()) {
            if (next == null) {
                next = itr.next();
            }
            if (next % 2 == 0) {
                return true;
            }
            else {
                while (itr.hasNext()) {
                    next = itr.next();
                    if (next % 2 == 0) {
                        number = next;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Integer next() throws NullPointerException {
//        number = next;
        if (hasNext()) {
            number = next;
            next = null;
            return number;
        }
        if (next % 2 == 0) {
            return next;
        }
        throw new NoSuchElementException();
    }
}
