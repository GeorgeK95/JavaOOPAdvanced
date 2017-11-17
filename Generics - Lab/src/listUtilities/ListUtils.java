package listUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ListUtils {
    public static <T> T getMin(List<T> list) {
        checkForEmptyList(list);
        list = list.stream().sorted().collect(Collectors.toList());
        return list.get(0);
    }

    private static <T> void checkForEmptyList(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Empty list!");
        }
    }

    public static <T> T getMax(List<T> list) {
        checkForEmptyList(list);
        list = list.stream().sorted().collect(Collectors.toList());
        return list.get(list.size() - 1);
    }

    //Null Finder task_5
    public static <T> List<Integer> getNullIndices(List<T> list) {
        checkForEmptyList(list);
        List<Integer> indexes = new ArrayList<>();
        int index = 0;
        for (T t : list) {
            if (t == null) {
                indexes.add(index);
            }
            index++;
        }
        return indexes;
    }

    //Generic Flat Method task_6
    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source) {
        for (List<? extends T> ts : source) {
            destination.addAll(ts);
        }
    }

    //Generic Add All Method task_7
    public static <T> void addAll(List<? super T> destination, List<? extends T> source) {
        destination.addAll(source);
    }
}
