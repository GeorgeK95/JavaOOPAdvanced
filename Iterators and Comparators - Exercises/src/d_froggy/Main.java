package d_froggy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputNumbers = Arrays.stream(in.nextLine().replace(",", "").split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Lake lake = new Lake(inputNumbers);
        print(lake);
    }

    private static void print(Lake lake) {
        StringBuilder builder = new StringBuilder();
        for (Integer integer : lake) {
            builder.append(integer).append(", ");
        }
        builder.setLength(builder.length() - 2);
        System.out.println(builder);
    }
}
