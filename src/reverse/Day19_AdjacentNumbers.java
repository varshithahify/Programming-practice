package reverse;

//program to remove adjacent elements in the given array
public class Day19_AdjacentNumbers {
		public static void main(String[] args) {
			int[] a= {1, 1, 2, 2, 3, 4, 4, 5, 6};
			for(int i=0;i<a.length-1;i++) {
				if(a[i]!=a[i+1]) {
					System.out.println(a[i]);
				}
			}
			System.out.println(a[a.length-1]);
		}
		}

