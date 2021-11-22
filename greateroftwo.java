package CXXXX;

import java.util.Scanner;

public class SDRFC {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		String c=(a>b)?" a is greater":(a<b)?"b is greater":"both are equal";
		System.out.println(c);
		}
}
