package com.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;
import com.operation.EmployeeOperation;

public class Main {

	public static void main(String[] args) {

		EmployeeOperation employeeOperation= new EmployeeOperation();
		
		LocalDate date = LocalDate.of(2000, 06, 16);
        Employee newEmployee = new Employee("Jivan", "Chavan", date, "g1@gmail.com", "Dev", 500000.0);
		employeeOperation.insertEmployee(newEmployee);
		
		LocalDate updatedDate = LocalDate.of(1998, 05, 01);
		Employee updatedEmployee =new Employee(3, "Sandip", "Chavan", updatedDate, "sandip@gmail.com", "Dev", 500000.0);

		employeeOperation.updateEmployee(updatedEmployee);
		employeeOperation.deleteEmployee(2);
		
		Employee getEmployee= employeeOperation.getEmployeeById(3);
		System.out.println(getEmployee);
		
		
		List<Employee> list1=employeeOperation.getAllEmployees();
		for (Employee employee : list1) {
			System.out.println(employee);
		}

		List<Employee> list2=employeeOperation.getEmployeesWithSalaryGreaterThan(70000);
		if(list2!=null) {
			for (Employee employee : list2) {
				System.out.println(employee);
			}
		}else {
			System.out.println("No such Employee");
		}
		
		List<String> listDepartments =new ArrayList<>();
		listDepartments.add("HR");
		listDepartments.add("Dev");
		
		List<Employee> list3=employeeOperation.getEmployeesInDepartments(listDepartments);
		
		if(list3!=null) {
			for (Employee employee : list3) {
				System.out.println(employee);
			}
		}else {
			System.out.println("No such Employee");
		}
		
		List<Employee> list4=employeeOperation.getEmployeesInDepartmentsOtherThan("HR");
		if(list4!=null) {
			for (Employee employee : list4) {
				System.out.println(employee);
			}
		}else {
			System.out.println("No such Employee");
		}
		
		
		List<Employee> list5=employeeOperation.getEmployeesSortedBySalaryDescending();
		if(list5!=null) {
			for (Employee employee : list5) {
				System.out.println(employee);
			}
		}else {
			System.out.println("No such Employee");
		}
		
		
	}
}
