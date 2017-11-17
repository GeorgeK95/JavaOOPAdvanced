package f_birthdayCelebrations;

import g_foodShortage.Buyer;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class Human implements Entity, Mammal {

    private String name;
    private String id;
    private String birthDay;
    private int age;
    private int food = 0;

    Human(String name, String id, String birthDay, int age) {
        this.name = name;
        this.id = id;
        this.birthDay = birthDay;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthDay() {
        return this.birthDay;
    }

    @Override
    public boolean wasBornInGivenYear(String year) {
        return this.getBirthDay().endsWith(year);
    }

    @Override
    public String getId() {
        return this.id;
    }

}
