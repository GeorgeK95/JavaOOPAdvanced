package sayHello;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Chinese implements Person {

    private static final String GREETING = "Djydjybydjy";
    private String name;

    public Chinese(String name) {
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
