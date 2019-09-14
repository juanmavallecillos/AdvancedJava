package anonymous;

public class TestAnonymous {
	
	
	private Counter counterByOne;
	private Counter counterByTwo;
	
	public TestAnonymous() {
		this.counterByOne = new Counter() {
			public int increment(int value) {
				value++;
				return value;
			}
		};
		this.counterByTwo = new Counter() {
			public int increment(int value) {
				value += 2;
				return value;
			}
		};
	}
	
	public Counter getCounterByOne() {
		return counterByOne;
	}
	public void setCounterByOne(Counter counterByOne) {
		this.counterByOne = counterByOne;
	}
	public Counter getCounterByTwo() {
		return counterByTwo;
	}
	public void setCounterByTwo(Counter counterByTwo) {
		this.counterByTwo = counterByTwo;
	}
	
	public static void main(String[] args) {
		TestAnonymous testAnonymous = new TestAnonymous();
		System.out.println(testAnonymous.getCounterByOne().increment(30));
		System.out.println(testAnonymous.getCounterByTwo().increment(20));
		
	}
	
}
