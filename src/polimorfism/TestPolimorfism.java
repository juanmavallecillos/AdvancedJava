package polimorfism;

public class TestPolimorfism {

	public TestPolimorfism() {};
	
	public static void printInformation(Person person) {
		System.out.println(person);
	}
	
	public static void main(String[] args) {
		Person lia = new Person("Lia", 23);
		//Student pep = new Person("Pep", 19);
		Person ana = new Student("Ana", 20);
		Teacher ian = new Teacher("Ian", 25);
		
		((Student) ana).addSubject("STW");
		
		printInformation(lia);
		//printInformation(pep);
		printInformation(ana);
		printInformation(ian);
	}
}
