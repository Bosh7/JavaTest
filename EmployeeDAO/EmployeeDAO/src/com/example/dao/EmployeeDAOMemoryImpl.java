package com.example.dao;

import com.example.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl implements EmployeeDAO {

    private static Employee[] employeeArray = new Employee[10];

    @Override
    public void add(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }

    @Override
    public void update(Employee emp) {
        // 目前與 add 相同，簡化寫法
        employeeArray[emp.getId()] = emp;
    }

    @Override
    public void delete(int id) {
        employeeArray[id] = null;
    }

    @Override
    public Employee findById(int id) {
        return employeeArray[id];
    }

    @Override
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}
