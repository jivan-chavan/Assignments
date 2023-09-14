package hospital;

public class Patient {
	 private int id;
	 private String patientName;
	 private int age;
	 private String gender;
	 private String address;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int id, String patientName, int age, String gender, String address) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + "]";
	}


}
