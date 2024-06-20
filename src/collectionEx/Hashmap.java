package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "pooja");
        hash_map.put(2, "priya");
        hash_map.put(3, "prualu");
        hash_map.put(3, "pru");
        System.out.println(hash_map);
        System.out.println("Enhance for loop in map");
        Set<Entry<Integer, String>> entrySet = hash_map.entrySet();
        
           for (Entry<Integer, String> entry : entrySet) 
           {
               System.out.println(entry.getKey()+" : "+entry.getValue());
           }
	}

}
