package by.htp.mainlinkedlist;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class MethodHashMap {

	public static void sortByValue(Map<String, Integer> hashmap) {
		// hashmap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println); ¬ ŒƒÕ” —“–Œ ”
		int i=0;
		int size = hashmap.size();
		String []b = new String[size];
		Integer [] a = new Integer[size];
		 for (Map.Entry<String, Integer> mapEntry : hashmap.entrySet()) {
			 	b[i] = mapEntry.getKey();
				a[i] = mapEntry.getValue();
	           i++;
	        }
	        for(i = a.length - 1 ; i > 0 ; i--){
	            for(int j = 0 ; j < i ; j++){  
	                if( a[j] < a[j+1]){
	                    int tmp = a[j];   
	                    String stmp = b[j];
	                    a[j] = a[j + 1]; 
	                    b[j] = b[j + 1]; 
	                    a[j + 1] = tmp;       
	                    b[j + 1] = stmp; 
	                }
	            }
	        }
	        Map<String, Integer> sorted = new LinkedHashMap<String, Integer>();
	        
	        for(int j = 0; j < size; j++){
	            sorted.put(b[j], a[j]);
	        }
	        System.out.println(sorted);
	    }

	public static void maxValue(Map<String, Integer> hashmap) {
		Iterator<Map.Entry<String, Integer>> itr = hashmap.entrySet().iterator();
		Map.Entry<String, Integer> max = null;
		while (itr.hasNext()) {
			Map.Entry<String, Integer> temp = itr.next();
			Iterator<Map.Entry<String, Integer>> itr2 = hashmap.entrySet().iterator();
			while (itr2.hasNext()) {
				Map.Entry<String, Integer> temp2 = itr2.next();
				if (temp.getValue() < temp2.getValue()) {
					max = temp2;
				}
			}
		}
		System.out.println(max);
	}

	public static void delNull(Map<String, Integer> hashmap) {
		Iterator<Map.Entry<String, Integer>> itr = hashmap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> value1 = itr.next();
			if (value1.getValue() == 0) {
				itr.remove();
			}
		}
		System.out.println(hashmap);
	}

}
