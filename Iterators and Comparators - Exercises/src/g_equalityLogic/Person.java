package g_equalityLogic;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;

        Person other = (Person) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.hashCode(), p.hashCode());
    }
}
