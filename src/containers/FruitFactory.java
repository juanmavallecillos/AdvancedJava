package containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FruitFactory {
	private static int counter;
	
	public FruitFactory() {}
	
	public static List<Apple> generateAppleList(){
		List<Apple> appleList = new ArrayList<Apple>();
		
		appleList.add(new Apple(counter, "Golden"));
		counter++;
		appleList.add(new Apple(counter, "Fuji"));
		counter++;
		appleList.add(new Apple(counter, "Royal Gala"));
		counter++;
		
		return appleList;
	}
	
	public static List<Orange> generateOrangeList(){
		List<Orange> orangeList = new ArrayList<Orange>();
		
		orangeList.add(new Orange(counter, "Navelina"));
		counter++;
		orangeList.add(new Orange(counter, "Navel Late"));
		counter++;
		orangeList.add(new Orange(counter, "Valències"));
		counter++;
		
		return orangeList;
	}
	
	public static HashMap<FruitCategory, List<? extends Fruit>> generateFruitsMap(){
		HashMap<FruitCategory, List<? extends Fruit>> hashMap = new HashMap<FruitCategory, List<? extends Fruit>>();
		hashMap.put(FruitCategory.APPLE, generateAppleList());
		hashMap.put(FruitCategory.ORANGE, generateOrangeList());
		
		return hashMap;
		
		
	}
}
