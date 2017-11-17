package i_mood_3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> data = Arrays.stream(in.nextLine().split(" | ")).filter(x -> !x.equals("|")).collect(Collectors.toList());
        IGameObject gameObject = gameObjectFactory(data);
        System.out.println(gameObject);
    }

    private static IGameObject gameObjectFactory(List<String> data) {
        switch (data.get(1)) {
            case "Demon":
                return new Demon(data.get(0), data.get(1), Double.parseDouble(data.get(2)), Integer.parseInt(data.get(3)));
            case "Archangel":
                return new Archangel(data.get(0), data.get(1), Double.parseDouble(data.get(2)), Integer.parseInt(data.get(3)));
            default:
                return null;
        }
    }
}
