package reverse;

import java.util.Arrays;

//printing array elements using for each(use only  when doing operations on index)
public class Day7_ArrayUsingForEach {
	public static void main(String[] args) {
			int[] a= {10,20,30,40};
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+ " ");
			}
			System.out.println("**********");
		System.out.println(Arrays.toString(a));
		System.out.println("**********");
		for(int v:a) {
			System.out.println(v+" ");
		}
	}}
