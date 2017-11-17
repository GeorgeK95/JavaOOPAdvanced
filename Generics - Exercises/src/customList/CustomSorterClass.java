package customList;

import java.util.Collections;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class CustomSorterClass {

    static <T extends Comparable<T>> void sort(CustomList<T> listParam) {
        Collections.sort(listParam.getList());
    }

}
