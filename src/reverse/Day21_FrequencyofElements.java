package reverse;

import java.util.LinkedHashMap;
import java.util.Map;

//program to find the frequency of a given array elements
public class Day21_FrequencyofElements {
	public static void main(String[] args) {
			Map<String,Integer> m=new LinkedHashMap<String,Integer>();
			m.put("a", 1);
			m.put("b", 2);
			m.put("c", 3);
			m.put("d", 4);
			System.out.println(m);
			System.out.println(m.get("a"));
			System.out.println(m.keySet());
			System.out.println(m.values());
			
		}
	}

