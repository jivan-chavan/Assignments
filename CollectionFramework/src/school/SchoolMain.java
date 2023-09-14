package school;

import java.util.Scanner;


public class SchoolMain {
	private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	
	int option=0;
	SchoolOperation schoolOperation = new SchoolOperation();

	do {
		
		System.out.println("************* Welcome...!!!!! *************");
		System.out.println("for following Operation, Please Select Number");
		System.out.println("Add Student - 1");
		System.out.println("Add Teacher- 2");
		System.out.println("View All Student - 3");
		System.out.println("View All Teacher - 4");
		System.out.println("Exit - 5");
		 option = scanner.nextInt();
		if (option == 1) {
			Student student = new Student(1,10,"Jivan",20);
			schoolOperation.addStudent(student);
		} else if (option == 2) {
			Teacher teacher = new Teacher("Sagar","Java",30,200000);
			schoolOperation.addTeacher(teacher);			 			
		}else if (option == 3) {
			schoolOperation.allStudents();
			 			
		}else if (option == 4) {
			schoolOperation.allTeachers();		 			
		} else if (option == 5) {
			// Exit -operation
			option=7;
			System.out.println("bye...!");
		}else {
			// Invalid Option selection-operation
			System.out.println("!!!! ....Invalid Option Selected. Please choose correct option.");
			option=6;
		}
	} while (option>0&&option<=6);
	
}
}
