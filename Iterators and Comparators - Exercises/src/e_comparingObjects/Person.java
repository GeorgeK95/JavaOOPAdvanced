package e_comparingObjects;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person p) {
        int nameComparison = this.name.compareTo(p.name);
        if (nameComparison == 0) {
            int ageComparison = Integer.compare(this.age, p.age);
            if (ageComparison == 0) {
                return this.town.compareTo(p.town);
            }
            return ageComparison;
        }
        return nameComparison;
    }
}
