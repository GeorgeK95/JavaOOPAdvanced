package dbExtended;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Person {
    private long id;
    private String userName;

    public Person(long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
