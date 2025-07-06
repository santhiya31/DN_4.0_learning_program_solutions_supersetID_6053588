package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.repository.EmployeeRepository;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee emp = new Employee();
		emp.setName("Santhiya");
		emp.setDepartment("IT");
		employeeRepository.save(emp);

		
		List<Employee> employees = employeeRepository.findAll();
		System.out.println("All Employees:");
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
