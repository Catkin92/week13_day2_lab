package com.codeclan.example.MorningLab.repositories;

import com.codeclan.example.MorningLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
