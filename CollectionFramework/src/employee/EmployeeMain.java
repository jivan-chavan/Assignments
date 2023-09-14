package employee;


public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeOperation employeeOperation =new EmployeeOperation();
		
		
		  Employee employee1=new Employee(101,"Jivan","Jalgaon",100000,26); Employee
		  employee2 = new Employee(102, "Amol", "Mumbai", 50000, 25); Employee
		  employee3 = new Employee(103, "Bhavana", "Delhi", 60000, 30); Employee
		  employee4 = new Employee(104, "Sandip", "New York", 75000, 28); Employee
		  employee5 = new Employee(105, "Arush", "London", 55000, 22);
		  
		  employeeOperation.addEmployee(employee1);
		  employeeOperation.addEmployee(employee2);
		  employeeOperation.addEmployee(employee3);
		  employeeOperation.addEmployee(employee4);
		  employeeOperation.addEmployee(employee5);
		 
		
		employeeOperation.viewEmployee();

		employeeOperation.searchEmployee(103);
		
	}
}
