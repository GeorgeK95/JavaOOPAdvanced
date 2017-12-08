package p03_employee_info.models;

import p03_employee_info.contracts.Database;
import p03_employee_info.contracts.Human;
import p03_employee_info.contracts.InfoProvider;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeInfoProvider implements InfoProvider {

    private Database database;

    public EmployeeInfoProvider(Database database) {
        this.database = database;
    }

    public List<Human> getByName() {
        return this.database.readEmployees().stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
    }

    public Iterable<Human> getBySalary() {
        return this.database.readEmployees().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());
    }
}
