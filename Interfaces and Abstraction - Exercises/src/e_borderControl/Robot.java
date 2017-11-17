package e_borderControl;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class Robot implements Entity {
    private String name;
    private String id;

    public Robot(String name, String id) {
        this.name = name;
        this.id = id;
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
