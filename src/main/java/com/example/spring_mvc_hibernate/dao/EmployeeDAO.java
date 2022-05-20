package com.example.spring_mvc_hibernate.dao;

import com.example.spring_mvc_hibernate.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public Employee deleteEmployee(int id);
}