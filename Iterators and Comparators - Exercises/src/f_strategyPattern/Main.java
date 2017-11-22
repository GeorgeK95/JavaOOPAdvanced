package f_strategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Set<Person> nameComparatorSet = new TreeSet<>(new PersonNameComparator());
        Set<Person> ageComparatorSet = new TreeSet<>(new PersonAgeComparator());
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = in.nextLine().split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            nameComparatorSet.add(person);
            ageComparatorSet.add(person);
        }
        printSet(nameComparatorSet);
        printSet(ageComparatorSet);
    }

    private static void printSet(Set<Person> people) {
        people.forEach(System.out::println);
    }
}
