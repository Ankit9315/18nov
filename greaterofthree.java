package CXXXX;

import java.util.Scanner;

public class greaterofthree {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		System.out.println("Enter the c value");
		int c=sc.nextInt();
		String d=(a>b)?(a>c)?"a is greater":"c is greater":(b>c)?"b is greater":"c is greater"; 
		System.out.println(d);
		}
}
