package sayHello;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Bulgarian implements Person {

    private static final String GREETING = "Здравей";
    private String name;

    public Bulgarian(String name) {
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
