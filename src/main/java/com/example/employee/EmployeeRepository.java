// Write your code here

package com.example.employee;

import java.util.*;
import com.example.employee.Employee;

public interface EmployeeRepository {
    ArrayList<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployeeById(int employeeId, Employee employee);

    void deleteEmployeeById(int employeeId);

}