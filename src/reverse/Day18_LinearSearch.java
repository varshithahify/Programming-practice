package reverse;

//program to search the given element in a unsorted array(Linear Search)
public class Day18_LinearSearch {
		public static void main(String[] args) {
			int[] a= {2,5,3,4,8,7,9,11};
			int search=5;
			for(int i=0;i<a.length;i++) {
				if(a[i]==search) {
					System.out.println("the element is found at index "+i);
					return;
				}
				}
			System.out.println("not found");
		}
		}

