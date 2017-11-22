package f_strategyPattern;

import java.util.Comparator;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
