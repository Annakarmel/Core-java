package com.xworkz.practice.Assignments;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		System.out.print("Enter the value of a and b\n");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		
		a = a+b;
		b = a-b;
		a = b-1;
		
		System.out.println("a = "+a +"\n"+ "b = "+b);
	}
}
