package com.example.employeeapplication.service;


        import com.example.employeeapplication.entity.Employee;

        import java.util.List;

public interface EmployeeService {

    public List<Employee> listEmployees();
    public Employee createEmployee(Employee employee);
    public Employee getById(Integer id);
    public void deleteById(Integer id);
}