package com.main;

import java.util.List;

import com.entity.Hospital;
import com.operation.Operation;

public class Main {

	public static void main(String[] args) {

		Operation operation= new Operation();
		Hospital hospital =new Hospital(1, "JJ Hospital","Mumbai","8123456789");
		operation.insertHospital(hospital);
		Hospital hospital2 =new Hospital(2, "New world Hospital","Delhi","8239467389");
		operation.insertHospital(hospital2);
		Hospital hospital3 =new Hospital(3, "Lilavati Hospital","Mumbai","9939467389");
		operation.insertHospital(hospital3);
		
		List<Hospital> list=operation.getAllHospitals();
		
		for (Hospital hospital4 : list) {
			System.out.println(hospital4);
		}
		
		Hospital hospitalUpdate =new Hospital(3, "Lilavati Hospital","Pune","7777777777");
		operation.updateHospital(hospitalUpdate);
		operation.deleteHospital(2);
		
		Hospital hospital5=operation.getHospital(3);
		System.out.println(hospital5);
		
	}

}
