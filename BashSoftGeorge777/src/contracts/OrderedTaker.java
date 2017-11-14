package contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface OrderedTaker {
    void orderAndTake(String courseName, String orderType);

    void orderAndTake(String courseName, String orderType, int studentsToTake);

}
