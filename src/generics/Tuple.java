package generics;

public class Tuple<T> {
	private T element;
	private T nextElement;
	
	public Tuple(T element, T nextElement) {
		this.element = element;
		this.nextElement = nextElement;
	}
	
	public T getElement() {
		return element;
	}
	
	public T getNextElement() {
		return nextElement;
	}
	
	public String toString() {
		String s;
		s = element.toString() + " " + nextElement.toString();
		return s;
	}
}
