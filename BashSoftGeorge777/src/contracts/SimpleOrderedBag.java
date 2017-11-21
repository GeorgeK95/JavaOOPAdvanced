package contracts;

import java.util.Collection;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface SimpleOrderedBag<E extends Comparable<E>> extends Iterable<E> {
    void add(E element);

    void addAll(Collection<E> elements);

    int size();

    String joinWith(String joiner);
}
