package i_linkedListTraversial.interfaces;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface LinkedList<Integer> extends Iterable<Integer> {
    int getSize();

    void add(int element);

    boolean remove(int element);
}
