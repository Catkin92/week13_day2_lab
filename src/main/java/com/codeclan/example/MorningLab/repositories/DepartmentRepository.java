package com.codeclan.example.MorningLab.repositories;

import com.codeclan.example.MorningLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
