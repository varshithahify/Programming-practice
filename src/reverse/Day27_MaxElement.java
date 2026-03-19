package reverse;

//program to display the maximum element in the given array(by taking min. value)
public class Day27_MaxElement {
	public static void main(String[] args) {
			int[] a= {1,2,9,6,3,4,1};
			int max=-1;
			for(int i=0;i<a.length;i++) {
				if(max<a[i]) {
					max=a[i];
					
				}
			}
			System.out.println(max);
		}
	}


