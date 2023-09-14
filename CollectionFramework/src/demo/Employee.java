package demo;

public class Employee {

	private String empid;
	private String name;
	private String role;
	private long salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empid, String name, String role, long salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}

}
