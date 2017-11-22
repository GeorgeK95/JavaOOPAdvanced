package e_comparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        while (!"END".equals(line)) {
            String[] data = line.split("\\s+");
            people.add(new Person(data[0], Integer.parseInt(data[1]), data[2]));
            line = in.nextLine();
        }

        printResult(people, people.get(Integer.parseInt(in.nextLine()) - 1));
    }

    private static void printResult(List<Person> people, Person p) {
        int total = people.size();
        int equal = (int) people.stream().filter(x -> x.compareTo(p) == 0).count();
        int notEqual = total - equal;

        if (equal > 1) {
            System.out.println(String.format("%d %d %d", equal, notEqual, total));
        } else {
            System.out.println("No matches");
        }
    }
}
