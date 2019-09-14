package containers;

import java.util.HashMap;
import java.util.List;

public class TestContainers {

	public TestContainers() {}
	
	public static void printFruitList(List<? extends Fruit> fruitList) {
		fruitList.forEach(fruit->System.out.println(fruit));
	}
	
	public static void printFruitsMap(HashMap<FruitCategory, List<? extends Fruit>> hashMap) {
		hashMap.forEach((category, fruitList)->{
			System.out.println(category);
			printFruitList(fruitList);
		});
	}
	
	public static void main(String[] args) {
		List<? extends Fruit> fruitList = FruitFactory.generateAppleList();
		
		HashMap<FruitCategory, List<? extends Fruit>> hashMap = FruitFactory.generateFruitsMap();
		
		printFruitList(fruitList);
		printFruitsMap(hashMap);
	}
}
