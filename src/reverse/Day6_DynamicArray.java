package reverse;

import java.util.Scanner;

//program to create dynamic array and display elements
public class Day6_DynamicArray {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of the elements:");
			int size=sc.nextInt();
			int[] a= new int[size];
			System.out.println("enternthe elements:");
			for(int i=0;i<a.length;i++) {
				System.out.println("enter the element for"+i+"index");
				a[i]=sc.nextInt();
				
			}
			System.out.print("elements are:");
			for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
			sc.close();
	}
	}

