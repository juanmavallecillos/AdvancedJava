package containers;

public enum FruitCategory {
	ORANGE("orange"),
	APPLE("apple");
	
	private String category;
	
	private FruitCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		return category;
	}
}
