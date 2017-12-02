package main.dataStructures;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class SimpleSortedList<E extends Comparable<E>> implements main.contracts.SimpleOrderedBag<E> {
    private static final int DEFAULT_SIZE = 16;

    private E[] innerCollection;
    private int size;
    private Comparator<E> comparator;

    public SimpleSortedList(Class<E> type) {
        this(type, Comparable::compareTo);
    }

    public SimpleSortedList(Class<E> type, Comparator<E> comparator) {
        this(type, comparator, DEFAULT_SIZE);
    }

    public SimpleSortedList(Class<E> type, int size) {
        this(type, Comparable::compareTo, size);
    }

    public SimpleSortedList(Class<E> type, Comparator<E> comparator, int capacity) {
        this.initializeInnerCollection(type, capacity);
        this.innerCollection = innerCollection;
        this.comparator = comparator;
    }

    private void initializeInnerCollection(Class<E> type, int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative!");
        }
        this.innerCollection = (E[]) Array.newInstance(type, capacity);
    }

    @Override
    public void add(E element) {
        if (element == null) {
            throw new IllegalArgumentException("Element is null.");
        }
        if (this.size() >= this.innerCollection.length) {
            this.resize();
        }
        this.innerCollection[this.size()] = element;
        this.size++;
        Arrays.sort(this.innerCollection, 0, this.size(), this.comparator);
    }

    @Override
    public void addAll(Collection<E> elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Elements are null.");
        }
        if (this.size() + elements.size() >= this.innerCollection.length) {
            this.multiResize(elements.size());
        }

        for (E element : elements) {
            this.innerCollection[this.size()] = element;
            this.size++;
        }

        Arrays.sort(this.innerCollection, 0, this.size(), this.comparator);
    }

    private void multiResize(int elementsSize) {
        int newSize = this.innerCollection.length * 2;
        while (this.size() + elementsSize >= newSize) {
            newSize *= 2;
        }
        this.innerCollection = Arrays.copyOf(this.innerCollection, newSize);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String joinWith(String joiner) {
        if (joiner == null) {
            throw new IllegalArgumentException("Joiner is null.");
        }
        StringBuilder builder = new StringBuilder();
        for (E e : Arrays.stream(innerCollection).filter(Objects::nonNull).collect(Collectors.toList())) {
            builder.append(e).append(joiner);
        }
        builder.setLength(builder.length() - joiner.length());
        return builder.toString();
    }

    @Override
    public boolean remove(E element) {
        if (element == null) {
            throw new IllegalArgumentException("Element is null.");
        }
        boolean hasBeenRemoved = false;
        int elementIndex = 0;

        for (int i = 0; i < this.size(); i++) {
            if (this.innerCollection[i].compareTo(element) == 0) {
                elementIndex = i;
                this.innerCollection[i] = null;
                hasBeenRemoved = true;
                break;
            }
        }

        if (hasBeenRemoved) {
            for (int i = elementIndex; i < this.size() - 1; i++) {
                this.innerCollection[i] = this.innerCollection[i + 1];

            }
            this.innerCollection[this.size() - 1] = null;
        }

        this.size--;
        return hasBeenRemoved;
    }

    @Override
    public int capacity() {
        return this.innerCollection.length;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < this.size(); i++) {
            if (this.innerCollection[i].compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < size();
            }

            @Override
            public E next() {
                return innerCollection[this.index++];
            }
        };
    }

    private void resize() {
        this.innerCollection = Arrays.copyOf(this.innerCollection, this.size() * 2);
    }
}
