package iterator;

import javax.naming.OperationNotSupportedException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IListIterator {
    boolean move();

    boolean hasNext();

    void print() throws OperationNotSupportedException;
}
