package com.xworkz.practice.Assignments;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int temp = n;
		int rem = n;
		
		while(temp != 0) {
			rem = temp % 10;
			count += Math.pow(rem ,3);
			temp /= 10;
		}
		if(count == n) {
			System.out.println("It is a Armstrong");
		}else {
			System.out.println("It is not Armstrong");
		}
	}
}
