import dbExtended.ExtendedDatabase;
import dbExtended.IExtendedDatabase;
import dbExtended.Person;
import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ExtendedDatabaseTests {
    @Test
    public void checkArrayCapacity() throws OperationNotSupportedException {
        IExtendedDatabase db = new ExtendedDatabase();
        int length = db.getPeople().length;
        Assert.assertEquals(16, length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddThrowsException() throws OperationNotSupportedException {
        IExtendedDatabase db = new ExtendedDatabase();
        db.add(new Person(-50,"Ivan"));
    }

    @Test
    public void testAdd() throws OperationNotSupportedException {
        IExtendedDatabase db = new ExtendedDatabase();
        db.add(new Person(5, "Pesho"));
        Assert.assertEquals(1, db.getIndex());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddOnFullArray() throws OperationNotSupportedException {
        IExtendedDatabase db = new ExtendedDatabase();
        for (int i = 0; i < 16; i++) {
            db.add(new Person(i, "Pesho"));
        }
        db.add(new Person(1100, "Pesho"));
    }

    @Test
    public void testRemove() throws OperationNotSupportedException {
        IExtendedDatabase db = new ExtendedDatabase();
        for (int i = 0; i < 4; i++) {
            db.add(new Person(i, "Pesho"));
        }
        db.remove();
        Assert.assertEquals(3, db.getIndex());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveOnEmptyDb() throws OperationNotSupportedException {
        IExtendedDatabase db = new ExtendedDatabase();
        db.remove();
    }


}
