package org.example.week7;

import java.util.List;

record Employee(int id, String name, double salary) {}

public class EmployeeManagementSystem {
    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        return employees.stream()
                .filter(employee -> employee.salary() >= minSalary)
                .toList();
    }

    public double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> employees) {
        employees.forEach(employee -> System.out.println("ID " + employee.id() + " name " + employee.name() + " salary " + employee.salary()));
    }

    public static void main(String[] args) {
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        List<Employee> employees = List.of(
                new Employee(1, "Frid Kahlo", 66000.70),
                new Employee(2, "Claude Monet", 54000),
                new Employee(3, "Salvador Dali", 82000.80),
                new Employee(4, "Mary Cassatt", 70000.50)
        );

        List<Employee> filteredEmployees = employeeManagementSystem.filterEmployeesBySalary(employees, 1000.0);
        System.out.println("Employees with salary >= 1000: " + filteredEmployees);

        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);
        System.out.println("Total salary of all employees: " + totalSalary);

        System.out.println("Employee details:");
        employeeManagementSystem.displayEmployeeDetails(employees);
    }
}
