import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements Iterator<Integer> {
    private Integer number;
    Iterator<Integer> itr;
    private int count;
    private int index;

    public MyIterator(Collection<Integer> collection) {
        itr = collection.iterator();
        for (int i : collection) {
            if (i % 2 != 0) {
                index++;
            }
        }
        if (index == collection.size()) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean hasNext() {
        while (itr.hasNext()) {
            number = itr.next();
            if (number != null && number % 2 == 0) {
                count++;
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    @Override
    public Integer next() throws NullPointerException {
        if (count != 0 && number != null && number % 2 == 0) {
            return number;
        } else {
            while (itr.hasNext()) {
                if ((number = itr.next()) != null && number % 2 == 0) {
                    break;
                }
            }
        }
        if (number % 2 != 0) {
            throw new NoSuchElementException();
        }
        return number;
    }
}
