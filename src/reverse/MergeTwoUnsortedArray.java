package reverse;

import java.util.Arrays;

//program to merge two unsorted array into one sorted array(using inbuilt function)
public class MergeTwoUnsortedArray {
		public static void main(String[] args) {
			int[] a1= {5,7,4};
			int[] a2= {2,3,1};
			int[] t=new int[a1.length+a2.length];
			System.arraycopy(a1, 0, t, 0, a1.length);
			System.arraycopy(a2, 0, t, a1.length, a2.length);
			Arrays.sort(t);
			System.out.println(Arrays.toString(t));
		}
	}


