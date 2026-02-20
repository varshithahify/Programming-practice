package reverse;

//program to reverse each word in a sentence with letter of each words as well
public class Day5_ReverseEachWordandLetter {
	public static String reverse(String str) {
	      String res = "";
	      for (int i = str.length() - 1; i >= 0; i--) {
	          res = res + str.charAt(i);
	      }
	      return res;
	  }
	
	  public static void main(String[] args) {
	
	      String s = "hello hii goodmorning";
	      System.out.println(s);
	
	      String[] x = s.split(" ");
	
	      for (int i = x.length-1; i>=0;i--) {
	          System.out.println(reverse(x[i]));
	      }
	  }
	}

