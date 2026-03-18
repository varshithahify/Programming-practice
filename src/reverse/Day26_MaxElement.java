package reverse;

//program to display the maximum element in the given array(using integer.minvalue)
public class Day26_MaxElement {
	public static void main(String[] args) {
			int[] a= {1,2,9,6,3,4,1};
			int max=Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++) {
				if(max<a[i]) {
					max=a[i];
					}
			}
			System.out.println(max);
		}
	}


