package CXXXX;

import java.util.Scanner;

public class digit {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		char choice;
		do {
			b=0;
			System.out.println("Enter the number:");
			a=sc.nextInt();
			while(a!=0) {
				a=a/10;
				b++;
			}
			if(b==1){
				System.out.println("NUMBER have 1 digit");
			}else {
				if(b==2) {
					System.out.println("NUMBER have 2 digit");
			}else {
				if(b==3) {
					System.out.println("NUMBER have 3 digit");
			}else {
				if(b==4){
				System.out.println("NUMBER have 4 digit");
				}else {
					if(b==5) {
					System.out.println("NUMBER have  5 digit");
					}else {
						System.out.println("NUMBER have greater than 5 digit");
					}
						}
				}
				}
				
			}
			System.out.println("Do you want to continue (Y/N)");
			choice=sc.next().charAt(0);
		}while(choice=='Y');
	}
}
