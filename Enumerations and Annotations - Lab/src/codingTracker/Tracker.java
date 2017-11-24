package codingTracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Tracker {
    @Author(name = "Pesho")
    public static void printMethodsByAuthor(Class<?> cl) {
        Map<String, List<String>> authorMethodsData = new HashMap<>();

        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            Author annotation = method.getAnnotation(Author.class);
            if (annotation != null) {
                authorMethodsData.putIfAbsent(annotation.name(), new ArrayList<>());
                authorMethodsData.get(annotation.name()).add(method.getName());
            }
        }

        print(authorMethodsData);
    }

    private static void print(Map<String, List<String>> authorMethodsData) {
        for (Map.Entry<String, List<String>> authorMethods : authorMethodsData.entrySet()) {
            System.out.println(String.format("%s: %s()", authorMethods.getKey(), String.join(", ", authorMethods.getValue())));
        }
    }
}
