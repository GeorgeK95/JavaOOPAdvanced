package g_trafficLights;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>(Arrays.stream(in.nextLine().split("\\s+")).collect(Collectors.toList()));
        int n = Integer.parseInt(in.nextLine());
        int lightsCount = queue.size();

        StringBuilder builder = new StringBuilder();
        int currentLine = 0;

        while (n > 0) {
            String light = queue.poll();
            int wantedOrdinal = Lights.valueOf(light).ordinal() + 1;
            if (wantedOrdinal >= Lights.values().length) {
                wantedOrdinal = 0;
            }
            queue.add(Lights.values()[wantedOrdinal].name());
            if (currentLine == lightsCount - 1) {
                builder.append(Lights.values()[wantedOrdinal].name()).append(System.lineSeparator());
                currentLine = -1;
                n--;
            } else {
                builder.append(Lights.values()[wantedOrdinal].name()).append(" ");
            }
            currentLine++;
        }

        System.out.println(builder);
    }
}
