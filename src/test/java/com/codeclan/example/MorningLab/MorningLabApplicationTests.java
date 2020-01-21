package com.codeclan.example.MorningLab;

import com.codeclan.example.MorningLab.models.Employee;
import com.codeclan.example.MorningLab.models.Project;
import com.codeclan.example.MorningLab.repositories.EmployeeRepository;
import com.codeclan.example.MorningLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MorningLabApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndProject() {
		Employee employee = new Employee("Eugene", "Kim", 69420);
		employeeRepository.save(employee);

		Project project = new Project("Thunderdome", 5);
		projectRepository.save(project);
	}

	@Test
	public void canAddEmployeeToProject() {
		Employee employee = new Employee("Eugene", "Kim", 69420);
		employeeRepository.save(employee);

		Project project = new Project("Thunderdome", 5);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
