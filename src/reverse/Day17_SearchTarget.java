package reverse;

///program to find the pair of elements which is equal to the given target
public class Day17_SearchTarget {
		public static void main(String[] args) {
			int[] a= {1,2,4,3,5,6,7,8,9,10,11};
			int t=10;
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]+a[j]==t) {
						System.out.println(a[i]+" "+a[j]);
					}
				}
			}
		}
	}

