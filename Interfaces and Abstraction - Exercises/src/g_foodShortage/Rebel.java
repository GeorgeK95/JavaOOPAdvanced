package g_foodShortage;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class Rebel implements Buyer {
    private static final int FOOD_VALUE = 5;
    static int FOOD = 0;

    private int age;
    private String group;
    private String name;

    public Rebel(String name, int age, String group) {
        this.age = age;
        this.group = group;
        this.name = name;
    }

    @Override
    public void buyFood() {
        Rebel.FOOD += FOOD_VALUE;
    }
}
