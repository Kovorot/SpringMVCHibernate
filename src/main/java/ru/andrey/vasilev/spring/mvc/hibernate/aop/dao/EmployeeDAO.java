package ru.andrey.vasilev.spring.mvc.hibernate.aop.dao;

import ru.andrey.vasilev.spring.mvc.hibernate.aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}
