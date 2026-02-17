package reverse;

//program to check wheather the given string is pallindrome or not
public class Day1_Palindrome {
	public static void main(String[] args) {
		  String str="mom";
		  String res=" ";
		  System.out.println(str);
		  for(int i=str.length()-1;i>=0;i--) {
			  res = res + str.charAt(i);
		  }
		  if(str.equals(res)) {
			  System.out.println("it is pallindrome");
		  }
		  else {
			  System.out.println("it's not pallindrome");
		  }
	}}

