package d_telephony;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] phones = in.nextLine().split("\\s+");
        String[] urls = in.nextLine().split("\\s+");

        Smartphone smartphone = new Smartphone();
        callNumbers(phones, smartphone);
        browseUrls(urls, smartphone);
    }

    private static void browseUrls(String[] urls, Smartphone smartphone) {
        for (String url : urls) {
            try {
                smartphone.browse(url);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }

    private static void callNumbers(String[] phones, Smartphone smartphone) {
        for (String phone : phones) {
            try {
                smartphone.call(phone);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }
}
