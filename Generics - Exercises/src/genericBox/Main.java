package genericBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
//        readInputAsString(n); //task_1
//        readInputAsInteger(n); //task_2
//        swapStringElements(n); //task_3
//        swapIntegerElements(n); //task_4
//        genericCountMethodStrings(n); //task_5
        genericCountMethodDoubles(n); //task_6
    }

    private static void genericCountMethodDoubles(int n) {
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double line = Double.parseDouble(in.nextLine());
            doubles.add(line);
        }
        System.out.println(Box.countGreaterValues(doubles, Double.parseDouble(in.nextLine())));
    }

    private static void genericCountMethodStrings(int n) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            strings.add(line);
        }
        System.out.println(Box.countGreaterValues(strings, in.nextLine()));
    }

    private static void swapIntegerElements(int n) {
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(in.nextLine());
            boxes.add(new Box<>(number));
        }
        int[] numbers = Arrays.stream(in.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Box.swap(boxes, numbers[0], numbers[1]);
        print(boxes);
    }

    private static void swapStringElements(int n) {
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            boxes.add(new Box<>(line));
        }
        int[] numbers = Arrays.stream(in.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Box.swap(boxes, numbers[0], numbers[1]);
        print(boxes);
    }

    private static void print(List<Box> boxes) {
        for (Box box : boxes) {
            System.out.println(box);
        }
    }

    private static void readInputAsInteger(int n) {
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(in.nextLine());
            System.out.println(new Box<>(number));
        }
    }

    private static void readInputAsString(int n) {
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            System.out.println(new Box<>(line));
        }
    }
}
