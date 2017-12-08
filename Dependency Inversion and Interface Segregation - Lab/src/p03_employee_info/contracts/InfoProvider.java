package p03_employee_info.contracts;

import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface InfoProvider {
    List<Human> getByName();

    Iterable<Human> getBySalary();
}
