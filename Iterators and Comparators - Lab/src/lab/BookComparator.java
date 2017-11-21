package lab;

import java.util.Comparator;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int titleComparison = o1.getTitle().compareTo(o2.getTitle());
        if (titleComparison == 0) {
            return Integer.compare(o1.getYear(), o2.getYear());
        }
        return titleComparison;
    }
}
