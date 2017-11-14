package sayHelloExtend;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class European extends BasePerson   implements Person{

    private static final String GREETING = "Hello";
    private String name;

     European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return GREETING;
    }

}
