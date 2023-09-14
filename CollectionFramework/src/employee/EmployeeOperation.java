package employee;

import java.util.LinkedHashSet;

public class EmployeeOperation {

	  LinkedHashSet<Employee> employeeSet = new LinkedHashSet<>();
	
	public void addEmployee(Employee employee) {
		employeeSet.add(employee);
		System.out.println("Employee is added successfully..!!");
	}
	
	public void viewEmployee(){
		if(!employeeSet.isEmpty()) {
			for (Employee employee : employeeSet) {
				System.out.println(employee);
			}
		}else {
			System.out.println("No record of employee.");
		}
	}
	
	
	public void searchEmployee(int id) {
		boolean flag=false;
		if(!employeeSet.isEmpty()) {
			for (Employee employee : employeeSet) {
				if(id==employee.getId()) {
					System.out.println(employee);
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println("No such employee.");
			}
		}else {
			System.out.println("No record of employee.");
		}
	}
	
}
