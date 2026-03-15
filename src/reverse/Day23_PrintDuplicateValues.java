package reverse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//program to print duplicate elements in the given array
public class Day23_PrintDuplicateValues {
			public static void main(String[] args) {
			int[] a= {1,2,2,3,3,3,4,4,5,6};
			Map<Integer,Integer> m=new LinkedHashMap<Integer, Integer>();
			for(int i=0;i<a.length;i++) {
				m.put(a[i], m.getOrDefault(a[i],0)+1);
			}
			System.out.println("key");
			for(Entry<Integer, Integer> l:m.entrySet()) {
				if(l.getValue()>1)
				System.out.println(l.getKey());
			}
		}
	}

