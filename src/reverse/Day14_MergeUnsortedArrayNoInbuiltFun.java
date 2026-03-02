package reverse;

import java.util.Arrays;

//program to merge two unsorted array into one sorted array(without using inbuilt function)
public class Day14_MergeUnsortedArrayNoInbuiltFun {
	
	
		public static void main(String[] args) {
			int[] a1= {5,7,4};
			int[] a2= {2,3,1};
			int[] t=new int[a1.length+a2.length];
			int j=0;
			for(int i=0;i<a1.length;i++) {
				t[j]=a1[i];
				j++;
		}
			for(int i=0;i<a2.length;i++) {
				t[j]=a2[i];
				j++;
			}
			Arrays.sort(t);
			System.out.println(Arrays.toString(t));
			}
	}

