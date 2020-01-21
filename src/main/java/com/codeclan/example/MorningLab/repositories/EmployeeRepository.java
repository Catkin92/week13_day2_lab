package com.codeclan.example.MorningLab.repositories;

import com.codeclan.example.MorningLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
