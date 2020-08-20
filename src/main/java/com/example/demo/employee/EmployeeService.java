package com.example.demo.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
	
	
	public List<Employee> getEmployees() {
        
        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Sandhya", 20, 0);
        Employee emp2 = new Employee("Kemp", 24, 2);
        Employee emp3 = new Employee("Anil", 22, 3);
        Employee emp4 = new Employee("Kumar", 30, 6);
        Employee emp5 = new Employee("Tim", 32, 7);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        

        Collections.sort(employeeList);

        return employeeList;




    }
	
	

	
}

