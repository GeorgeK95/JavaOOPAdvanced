package db;

import javax.naming.OperationNotSupportedException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Database implements IDatabase {
    private static final Integer DEFAULT_SIZE = 16;
    private Integer[] numbers;
    private Integer index;

    public Database(Integer... numbers) throws OperationNotSupportedException {
        this.numbers = new Integer[DEFAULT_SIZE];
        this.index = 0;
        this.setNumbers(numbers);
    }

    private void setNumbers(Integer[] _numbers) throws OperationNotSupportedException {
        for (Integer number : _numbers) {
            this.addNumber(number);
        }
    }

    public void addNumber(Integer number) throws OperationNotSupportedException {
        if (number == null) {
            throw new OperationNotSupportedException("Number is null.");
        }
        if (this.index > 15) {
            throw new OperationNotSupportedException("Array limit length is reached.");
        }

        this.numbers[this.index++] = number;
    }

    public void removeNumber() throws OperationNotSupportedException {
        if (this.index == 0) {
            throw new OperationNotSupportedException("db.Database is empty.");
        }
        this.numbers[this.index--] = null;
    }

    public Integer[] fetch() {
        return this.numbers;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public int getIndex() {
        return index;
    }
}
