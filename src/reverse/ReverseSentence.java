package reverse;

//program to reverse the sentence
public class ReverseSentence {
	public static void main(String[] args) {
			String s="hii hello";
			String[] x=s.split(" ");
			for(int i=x.length-1;i>=0;i--) {
				System.out.println(x[i]);
			}
		}
	}

