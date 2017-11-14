package sayHelloExtend;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Bulgarian extends BasePerson implements Person {

    private static final String GREETING = "Здравей";
    private String name;

    Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return GREETING;
    }

}
