package generics;

public class TestGenerics {
	public TestGenerics() {}
	
	public static void testTuple() {
		Tuple<Integer> intTuple = new Tuple<Integer>(2, 4);
		Tuple<String> stringTuple = new Tuple<String>("Jose", "Juanma");
		
		System.out.println(intTuple);
		System.out.println(stringTuple);
	}
	
	public static void testVariedTuple() {
		VariedTuple<Integer, String> varied1 = new VariedTuple<Integer, String>(5, "Alex");
		VariedTuple<Integer, Integer> varied2 = new VariedTuple<Integer, Integer>(20,22);
		
		System.out.println(varied1);
		System.out.println(varied2);
	}
	
	public static void main(String[] args) {
		testTuple();
		testVariedTuple();
	}
}
