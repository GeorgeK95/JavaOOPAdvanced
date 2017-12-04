package dbExtended;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ExtendedDatabase implements IExtendedDatabase {
    private static final Integer DEFAULT_SIZE = 16;
    private Person[] people;
    private int index;

    public ExtendedDatabase() {
        this.index = 0;
        this.people = new Person[DEFAULT_SIZE];
    }

    public Person findById(Long id) throws OperationNotSupportedException {
        if (id == null) {
            throw new OperationNotSupportedException("Given id is null.");
        }
        Optional<Person> found = Arrays.stream(this.people).filter(x -> x != null && Objects.equals(x.getId(), id)).findFirst();
        if (found.isPresent()) {
            return found.get();
        } else {
            throw new OperationNotSupportedException("User with the given id was not found.");
        }
    }

    public Person findByUsername(String userName) throws OperationNotSupportedException {
        if (userName == null) {
            throw new OperationNotSupportedException("Given username is null.");
        }
        Optional<Person> found = Arrays.stream(this.people).filter(x -> x != null && Objects.equals(x.getUserName(), userName)).findFirst();
        if (found.isPresent()) {
            return found.get();
        } else {
            throw new OperationNotSupportedException("User with the given username was not found.");
        }
    }

    public void add(Person p) throws OperationNotSupportedException {
        if (/*p == null || */p.getId() == null || p.getId() < 0) {
            throw new OperationNotSupportedException("Invalid id.");
        }
        if (Arrays.stream(this.people).filter(x -> x != null && Objects.equals(x.getId(), p.getId())).count() != 0) {
            throw new OperationNotSupportedException("There are other users with the given id.");
        }
        if (this.index > 15) {
            throw new OperationNotSupportedException("Array limit length is reached.");
        }

        this.people[this.index++] = p;
    }

    public void remove() throws OperationNotSupportedException {
        if (this.index == 0) {
            throw new OperationNotSupportedException("db.Database is empty.");
        }
        this.people[this.index--] = null;
    }

    public Person[] getPeople() {
        return people;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
