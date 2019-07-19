package EnumerationIterator;

import java.util.Iterator;

public class IterationEnumerator implements Iterator<Object> {

    Iterator<?> iterator;

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }

    @Override
    public void remove() {
        iterator.remove();
    }
}
