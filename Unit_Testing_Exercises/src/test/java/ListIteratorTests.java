import iterator.IListIterator;
import iterator.ListIterator;
import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ListIteratorTests {
    @Test
    public void testSingleMove() throws OperationNotSupportedException {
        IListIterator li = new ListIterator("Ivan", "Pesho", "Go4o");
        Assert.assertEquals("Error in move().", true, li.move());
    }

    @Test
    public void testManyMoves() throws OperationNotSupportedException {
        IListIterator li = new ListIterator("Ivan", "Pesho", "Go4o");
        li.move();
        li.move();
        Assert.assertEquals("Error in move().", false, li.move());
    }

    @Test
    public void testHasNextTrue() throws OperationNotSupportedException {
        IListIterator li = new ListIterator("Ivan", "Pesho", "Go4o");
        Assert.assertEquals("Error in hasNext().", true, li.hasNext());
    }

    @Test
    public void testHasNextFalse() throws OperationNotSupportedException {
        IListIterator li = new ListIterator("Ivan", "Pesho", "Go4o");
        li.move();
        li.move();
        Assert.assertEquals("Error in hasNext().", false, li.hasNext());
    }

    @Test
    public void testPrint() throws OperationNotSupportedException {
        IListIterator li = new ListIterator("Ivan", "Pesho", "Go4o");
        li.move();
        li.print();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testPrintThrowsException() throws OperationNotSupportedException {
        IListIterator li = new ListIterator();
        li.print();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testCtor() throws OperationNotSupportedException {
        IListIterator li = new ListIterator(null);
    }
}
