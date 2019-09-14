package containers;

public abstract class Fruit {
	private int id;
	private String subCategory;
	private FruitCategory category;
	
	public Fruit(int id, FruitCategory category, String subCategory) {
		this.id = id;
		this.category = category;
		this.subCategory = subCategory;
	}
	
	public String toString() {
		return category.toString() + "::" + subCategory + "::" + id;
	}
}
