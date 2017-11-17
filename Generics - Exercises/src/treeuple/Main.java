package treeuple;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Treeuple tuple = new Treeuple();

        writeStringData(tuple, in.nextLine().split("\\s+"));
        writeStringIntegerBooleanData(tuple, in.nextLine().split("\\s+"));
        writeStringDoubleStringData(tuple, in.nextLine().split("\\s+"));
    }

    private static void writeStringDoubleStringData(Treeuple tuple, String[] data) {
        tuple.setItem_1(data[0]);
        tuple.setItem_2(Double.parseDouble(data[data.length - 2]));
        tuple.setItem_3(data[data.length - 1]);
        System.out.println(tuple);
    }

    private static void writeStringIntegerBooleanData(Treeuple tuple, String[] data) {
        tuple.setItem_1(data[0]);
        tuple.setItem_2(Integer.parseInt(data[data.length - 2]));
        tuple.setItem_3(data[data.length - 1].equals("drunk"));
        System.out.println(tuple);
    }

    private static void writeStringData(Treeuple tuple, String[] data) {
        tuple.setItem_1(getFirstElement(data));
        tuple.setItem_2(data[2]);
        tuple.setItem_3(data[3]);
        System.out.println(tuple);
    }

    private static String getFirstElement(String[] data) {
        String first = "";
        for (int i = 0; i < data.length - 2; i++) {
            String current = data[i];
            first = first.concat(current + " ");
        }
        first = first.trim();
        return first;
    }
}
