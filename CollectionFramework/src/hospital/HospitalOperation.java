package hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalOperation {

	private List<Patient> patientList= new ArrayList<>();
	
	public void addPatient(Patient patient) {
		patientList.add(patient);
		System.out.println("Patient added successfully");
	}
	
	public void viewAllPatientDetails() {
		if(!patientList.isEmpty()) {
			for (Patient patient : patientList) {
				System.out.println(patient);
			}
		}else {
			System.out.println("No records");
		}
	}
	public void searchPatient(int id) {
		boolean flag=false;
		if(!patientList.isEmpty()) {

			for (Patient patient : patientList) {
				if(patient.getId()==id) {
					System.out.println(patient);
					flag=true;
					break;
				}
				
			}
			if(!flag) {
				System.out.println("No such patient");
			}
		}else {
			System.out.println("No records");
		}
	}
}
