package reverse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//program to print the frequency of a given array elements
public class Day22_FrequencyOfElements2 {
	public static void main(String[] args) {
		int[] a= {1,2,2,3,3,3,4,4,5,6};
		Map<Integer,Integer> m=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			m.put(a[i], m.getOrDefault(a[i],0)+1);
		}
		System.out.println("key"+"\t"+"value");
		for(Entry<Integer,Integer> l:m.entrySet()) {
			System.out.println(l.getKey()+" "+"\t"+l.getValue());
		}
	}
}

