package reverse;

import java.util.Set;
import java.util.TreeSet;

//program to remove duplicate elements in the given array
public class Day20_RemoveDuplicates {
		public static void main(String[] args) {
			int[] a= {1,1,3,3,7,8,8,2,5,5,1};
			Set<Integer> l=new TreeSet<Integer>();
			for(int i=0;i<a.length;i++) {
				l.add(a[i]);
			}
			System.out.println(l);
			
		}
	}

