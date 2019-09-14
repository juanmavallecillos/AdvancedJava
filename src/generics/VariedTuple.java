package generics;

public class VariedTuple<A, B> {
	private A element;
	private B nextElement;
	
	public VariedTuple(A element, B nextElement) {
		this.element = element;
		this.nextElement = nextElement;
	}
	
	public String toString() {
		String s;
		s = element.toString() + " " + nextElement.toString();
		return s;
	}
}
