package customList;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static CustomList<String> list = new CustomList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while (!input.equals("END")) {
            String[] inputData = input.split("\\s+");
            switch (inputData[0]) {
                case "Add":
                    executeAdd(inputData[1]);
                    break;
                case "Remove":
                    executeRemove(Integer.parseInt(inputData[1]));
                    break;
                case "Contains":
                    executeContain(inputData[1]);
                    break;
                case "Swap":
                    executeSwap(Integer.parseInt(inputData[1]), Integer.parseInt(inputData[2]));
                    break;
                case "Sort":
                    executeSort();
                    break;
                case "Greater":
                    executeGreater(inputData[1]);
                    break;
                case "Max":
                    executeMax();
                    break;
                case "Min":
                    executeMin();
                    break;
                case "Print":
                    executePrint();
                    break;
            }
            input = in.nextLine();
        }
    }

    private static void executeSort() {
        CustomSorterClass.sort(list);
    }

    private static void executeSwap(int i, int j) {
        list.swap(i, j);
    }

    private static void executePrint() {
        System.out.println(list.toString());
    }

    private static void executeMin() {
        System.out.println(list.getMin());
    }

    private static void executeMax() {
        System.out.println(list.getMax());
    }

    private static void executeGreater(String param) {
        System.out.println(list.countGreaterThan(param));
    }

    private static void executeContain(String param) {
        System.out.println(list.contains(param));
    }

    private static void executeRemove(int param) {
        list.remove(param);
    }

    private static void executeAdd(String param) {
        list.add(param);
    }
}
