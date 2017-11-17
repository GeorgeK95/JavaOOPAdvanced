package tuple;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class Tuple<T> {
    private T item_1;
    private T item_2;

    T getItem_1() {
        return item_1;
    }

    void setItem_1(T item_1) {
        this.item_1 = item_1;
    }

    T getItem_2() {
        return item_2;
    }

    void setItem_2(T item_2) {
        this.item_2 = item_2;
    }

    @Override
    public String toString() {
        return this.item_1 + " -> " + this.item_2;
    }
}
