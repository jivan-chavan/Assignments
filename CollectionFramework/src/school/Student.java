package school;

public class Student {
	private int rollNumber;
	 private int standard;
	 private String name;
	 private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, int standard, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.standard = standard;
		this.name = name;
		this.age = age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", standard=" + standard + ", name=" + name + ", age=" + age + "]";
	}

	 
 
}
