package tuple;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tuple tuple = new Tuple();

        writeStringData(tuple, in.nextLine().split("\\s+"));
        writeStringIntegerData(tuple, in.nextLine().split("\\s+"));
        writeIntegerDoubleData(tuple, in.nextLine().split("\\s+"));
    }

    private static void writeIntegerDoubleData(Tuple tuple, String[] data) {
        tuple.setItem_1(Integer.parseInt(data[0]));
        tuple.setItem_2(Double.parseDouble(data[data.length - 1]));
        System.out.println(tuple);
    }

    private static void writeStringIntegerData(Tuple tuple, String[] data) {
        tuple.setItem_1(data[0]);
        tuple.setItem_2(Integer.parseInt(data[data.length - 1]));
        System.out.println(tuple);
    }

    private static void writeStringData(Tuple tuple, String[] data) {
        tuple.setItem_1(getFirstElement(data));
        tuple.setItem_2(data[2]);
        System.out.println(tuple);
    }

    private static String getFirstElement(String[] data) {
        String first = "";
        for (int i = 0; i < data.length - 1; i++) {
            String current = data[i];
            first=  first.concat(current + " ");
        }
        first = first.trim();
        return first;
    }
}
