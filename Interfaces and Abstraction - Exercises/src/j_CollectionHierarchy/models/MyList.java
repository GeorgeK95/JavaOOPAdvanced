package j_CollectionHierarchy.models;

import j_CollectionHierarchy.interfaces.IRemovable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class MyList<T> implements IRemovable<T> {
    private List<T> list;

    public MyList() {
        this.list = new ArrayList<T>();
    }

    @Override
    public int add(T e) {
        this.list.add(0, e);
        return 0;
    }

    @Override
    public T remove() {
        return this.list.remove(0);
    }
}
