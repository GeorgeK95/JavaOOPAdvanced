package c_stack;

import java.util.*;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CustomStack implements Iterable<Integer> {
    private List<Integer> stack;

    CustomStack() {
        this.stack = new ArrayList<>();
    }

    void push(int element) {
        this.stack.add(0, element);
    }

    void pop() {
        this.stack.remove(0);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomStackIterator();
    }

    private class CustomStackIterator implements Iterator<Integer> {
        private int index;

        @Override
        public boolean hasNext() {
            return this.index < CustomStack.this.stack.size();
        }

        @Override
        public Integer next() {
            return CustomStack.this.stack.get(this.index++);
        }
    }
}
