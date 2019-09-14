package polimorfism;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("David",20);
		p.addAddress("Spain", "Barcelona", "Carrer aixo", 19);
		
		System.out.println(p);
		
		Person.Address addr = p.new Address("Spain", "Barcelona", "Carrer Fals", 123);
		System.out.println(addr);
		
		p.addAddress(addr);
		
		p.printAddresses();
		}
}
