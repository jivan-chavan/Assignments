package school;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SchoolOperation {
	 HashSet<Student> studentSet= new HashSet<>();
	 HashSet<Teacher> teacherSet= new HashSet<>();


	public void addStudent(Student student) {
		studentSet.add(student);
		System.out.println("Student is successfully added");
	}
	
	public void addTeacher(Teacher teacher) {
		teacherSet.add(teacher);
		System.out.println("Teacher is successfully added");
	}
	
	public void allStudents() {
		if(!studentSet.isEmpty()) {
			System.out.println("Details of all Students are : ");
			for (Student student : studentSet) {
				System.out.println(student);
			}
		}
		else {
			System.out.println("No record of student");
		}
	}
		public void allTeachers() {
			if(!teacherSet.isEmpty()) {
				System.out.println("Details of all Teachers are : ");
				for (Teacher teacher : teacherSet) {
					System.out.println(teacher);
				}
			}
			else {
				System.out.println("No record of teacher ");
			}
	}
		
	
}
