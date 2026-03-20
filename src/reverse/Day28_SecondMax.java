package reverse;

//program to find second maximum element in the given array
public class Day28_SecondMax {
		public static void main(String[] args) {
			int[] a= {1,2,9,6,3,4,1};
			int fmax=-1,  smax=-2;
			for(int i=0;i<a.length;i++) {
				if(fmax<a[i]) {
				
				smax=fmax;
				fmax=a[i];
				}
				else if(smax<a[i]){
					smax=a[i];
				}
			}
			System.out.println(fmax+ " "+smax);
		}}

