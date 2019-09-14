package polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	
	private List<Student> students = new ArrayList<Student>();
	
	public Teacher(String name, int age) {
		super(name, age);
	}
	
	public Teacher(String name, int age, List<Student> students) {
		super(name, age);
		this.students = students;
	}
	
	public void addStudent(Student newStudent) {
		students.add(newStudent);
	}
	
	public String toString() {
		String s;
		s = super.toString();
		for(Student student : students) {
			s += " " + student.toString();
		}
		
		return s;
	}
	
}
