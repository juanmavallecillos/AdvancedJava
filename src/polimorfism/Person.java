package polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private int age;
	private String name;
	private List<Person.Address> addresses = new ArrayList<Person.Address>();
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void addAddress(Address adr) {
		addresses.add(adr);
	}
	
	public void addAddress(String ctry, String prov, String st, int num) {
		Address adr = new Address(ctry, prov,st,num);
		addresses.add(adr);
	}
	
	public void printAddresses() {
		for (Person.Address addr : addresses) {
			System.out.println(addr);
		}
	}
	
	public String toString() {
		return name + " " + age;
	}
	
	
	public class Address {
		private String country;
		private String province;
		private String street;
		private int number;

		public Address(String ctry, String prov, String st, int num) {
			country = ctry;
			province = prov;
			street = st;
			number = num;
		}
		
		public String toString() {
			return street + " " + number + " " + province + " " + country;
		}
	}
}
