package by.htp.mainlinkedlist;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("Tires", 36556);
		hashmap.put("Notebook", 1893);
		hashmap.put("AK-47", 0);
		hashmap.put("Mobile", 2403);
		hashmap.put("TV", 1086);
		hashmap.put("SSD", 1056);
		hashmap.put("USBFlash", 2615);
		hashmap.put("Bomb", 0);
		hashmap.put("CarBattery", 2488);

		MethodHashMap.delNull(new HashMap<>(hashmap));
		System.out.println();
		MethodHashMap.maxValue(new HashMap<>(hashmap));
		System.out.println();
		MethodHashMap.sortByValue(new HashMap<>(hashmap));
	}
}
