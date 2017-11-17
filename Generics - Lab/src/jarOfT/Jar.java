package jarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Jar<T> {
    private Deque<T> jar;

    public Jar() {
        this.jar = new ArrayDeque<T>();
    }

    public void add(T element) {
        this.jar.push(element);
    }

    public T remove() {
        return this.jar.pop();
    }
}
