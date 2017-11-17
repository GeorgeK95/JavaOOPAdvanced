package f_birthdayCelebrations;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class Pet implements Mammal {
    private String name;
    private String birthDay;

    Pet(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
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
}
