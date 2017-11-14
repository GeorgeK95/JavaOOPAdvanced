package sayHelloExtend;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BasePerson implements Person {

    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }
}
