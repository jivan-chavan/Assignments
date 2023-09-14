package school;

public class Teacher {
    private String name;
    private String subject;
    private int age;
    private double salary;
    

    public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String subject, int age, double salary) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", age=" + age + ", salary=" + salary + "]";
	}
    


}

