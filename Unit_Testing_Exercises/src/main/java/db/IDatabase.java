package db;

import javax.naming.OperationNotSupportedException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IDatabase {
    void addNumber(Integer number) throws OperationNotSupportedException;

    void removeNumber() throws OperationNotSupportedException;

    Integer[] fetch();

    public Integer[] getNumbers();

    public int getIndex();

}
