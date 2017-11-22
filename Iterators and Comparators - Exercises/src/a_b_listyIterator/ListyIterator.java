package a_b_listyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int index;

    void create(String... elements) {
        this.elements = Arrays.asList(elements);
    }

    boolean move() {
        if (this.index < elements.size() - 1) {
            index++;
            return true;
        }
        return false;
    }

    void print() {
        System.out.println(elements.get(this.index));
    }

    boolean hasNext() {
        return this.index < this.elements.size() - 1;
    }

    @Override
    public Iterator<String> iterator() {
        return new IterableListyIterator();
    }

    private class IterableListyIterator implements Iterator<String> {
        private int iterIndex = 0;

        @Override
        public boolean hasNext() {
            return this.iterIndex < elements.size();
        }

        @Override
        public String next() {
            return elements.get(this.iterIndex++);
        }
    }
}
