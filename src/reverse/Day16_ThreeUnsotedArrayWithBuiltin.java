package reverse;

import java.util.Arrays;

//program to merge three unsorted array into one sorted array(using inbuilt function)
public class Day16_ThreeUnsotedArrayWithBuiltin {
		public static void main(String[] args) {
			int[] a1= {5,7,4};
			int[] a2= {2,3,1};
			int[] a3= {8,6,9};
	
			int[] t=new int[a1.length+a2.length+a3.length];
			System.arraycopy(a1, 0, t, 0, a1.length);
			System.arraycopy(a2, 0, t, a1.length, a2.length);
			System.arraycopy(a3, 0, t, a1.length+a2.length, a3.length);
			Arrays.sort(t);
			System.out.println(Arrays.toString(t));
		}
	}

