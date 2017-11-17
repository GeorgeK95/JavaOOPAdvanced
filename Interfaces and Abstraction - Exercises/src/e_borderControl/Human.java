package e_borderControl;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class Human implements Entity {

    private String name;
    private String id;
    private int age;

    public Human(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isIdFake(String id) {
        return this.getId().endsWith(id);
    }
}
