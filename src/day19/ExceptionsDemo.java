package day19;

import java.util.Scanner;

public class ExceptionsDemo {
	
	public static void main(String[] args) {

		System.out.println("program is started.........");
		
		Scanner sc=new Scanner(System.in);
		
		//Example1
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(100/num);   // ArithmeticException
		*/
		
		//Example2
		/*int a[]=new int[5];
		
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		
		a[pos]=value;   //ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);
		*/
		
		//Example3
		/*String s="welcome";
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println(num);
		*/
		
		//Example4
		String s=null;
		System.out.println(s.length()); //NullPointerException
		
		
				
		System.out.println("program is completed........");

	}

}
