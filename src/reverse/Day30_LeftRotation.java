package reverse;

//program to rotate the given array elements towards left(left rotation)
public class Day30_LeftRotation {
		public static void main(String[] args) {
	        int[] a= {1,2,3,4,5};
	        int k=1;
	        k=k%a.length;

	        for(int i=0;i<a.length;i++) {
	            if(i < a.length - k) {
	                System.out.println(a[i + k]);
	            }
	            else {
	                System.out.println(a[i + k - a.length]);
	            }
	        }
	    }
	}

