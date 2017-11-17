package j_CollectionHierarchy.models;

import j_CollectionHierarchy.interfaces.IAddable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class AddCollection<T> implements IAddable<T> {
    private List<T> list;

    public AddCollection() {
        this.list = new ArrayList<T>();
    }

    @Override
    public int add(T e) {
        this.list.add(e);
        return this.list.size() - 1;
    }
}
