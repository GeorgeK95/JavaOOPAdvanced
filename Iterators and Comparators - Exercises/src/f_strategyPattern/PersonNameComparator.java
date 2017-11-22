package f_strategyPattern;

import java.util.Comparator;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int nameLength = Integer.compare(o1.getName().length(), o2.getName().length());
        if (nameLength == 0) {
            return Integer.compare(Character.toLowerCase(o1.getName().charAt(0)), Character.toLowerCase(o2.getName().charAt(0)));
        }
        return nameLength;
    }
}
