package dbExtended;

import javax.naming.OperationNotSupportedException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IExtendedDatabase {
    Person findById(Long id) throws OperationNotSupportedException;

    Person findByUsername(String userName) throws OperationNotSupportedException;

    void add(Person p) throws OperationNotSupportedException;

    void remove() throws OperationNotSupportedException;

    public Person[] getPeople();

    int getIndex();
}
