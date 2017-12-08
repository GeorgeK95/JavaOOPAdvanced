package p03_employee_info.models;

import p03_employee_info.contracts.Database;
import p03_employee_info.contracts.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabase implements Database {

    @Override
    public List<Human> readEmployees() {
        List<Human> employees = new ArrayList<>();
        Collections.addAll(employees,
                new Employee("Pesho", 20),
                new Employee("Gosho", 40));

        return employees;
    }
}
