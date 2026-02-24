package model;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {

    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        boolean removed = employeeList.removeIf(emp -> emp.getId() == id);

        if (removed) {
            System.out.println("Employee Removed Successfully");
        } else {
            System.out.println("Employee Not Found");
        }
    }

    public void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}