package com.example.employeeapplication.dao;



        import com.example.employeeapplication.entity.Employee;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}