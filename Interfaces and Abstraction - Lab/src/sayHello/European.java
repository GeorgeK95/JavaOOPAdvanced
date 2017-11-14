package sayHello;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class European implements Person {

    private static final String GREETING = "Hello";
    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String sayHello() {
        return GREETING;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
