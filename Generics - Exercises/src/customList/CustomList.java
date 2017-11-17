package customList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class CustomList<T extends Comparable<T>>  {
    private List<T> list;

    CustomList() {
        this.list = new ArrayList<>();
    }

    void add(T element) {
        list.add(element);
    }

    T remove(int index) {
        return list.remove(index);
    }

    boolean contains(T element) {
        return this.list.contains(element);
    }

    void swap(int i, int j) {
        Collections.swap(this.list, i, j);
    }

    T getMin() {
        return this.list.stream().sorted().collect(Collectors.toList()).get(0);
    }

    T getMax() {
        return this.list.stream().sorted().collect(Collectors.toList()).get(this.list.size() - 1);
    }

    int countGreaterThan(T element) {
        int result = 0;
        for (T t : list) {
            if (t.compareTo(element) > 0) {
                result++;
            }
        }
        return result;
    }

    void print() {
        Iterator<T> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : list) {
            builder.append(t);
            builder.append(System.lineSeparator());
        }
        return builder.toString().trim();
    }

    List<T> getList() {
        return list;
    }


}
