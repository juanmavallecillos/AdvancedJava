package polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	private List<String> subjects = new ArrayList<String>();
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, List<String> subjects) {
		super(name, age);
		this.subjects = subjects;
	}
	
	public void addSubject(String subject) {
		subjects.add(subject);
	}
	
	public String toString() {
		String s;
		s = super.toString();
		for(String subject : subjects) {
			s += " " + subject;
		}
		
		return s;
	}
}
