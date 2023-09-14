package hospital;

public class HospitalMain {

	public static void main(String[] args) {

		HospitalOperation hospitalOperation= new HospitalOperation();
		
	
		Patient patient1 = new Patient(201, "Ajay", 25, "Male", "Mumbai");
		Patient patient2 = new Patient(202, "Sneha", 30, "Female", "Delhi");
		Patient patient3 = new Patient(203, "Rajesh", 35, "Male", "Bangalore");
		Patient patient4 = new Patient(204, "Preeti", 20, "Female", "Kolkata");
		Patient patient5 = new Patient(205, "Amit", 46, "Male", "Chennai");

		hospitalOperation.addPatient(patient1);
		hospitalOperation.addPatient(patient2);
		hospitalOperation.addPatient(patient3);
		hospitalOperation.addPatient(patient4);
		hospitalOperation.addPatient(patient5);
		
		
		hospitalOperation.viewAllPatientDetails();
		hospitalOperation.searchPatient(203);
	}

}
