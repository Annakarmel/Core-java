package com.xworkz.practice.Assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		
		System.out.println("Origianl word: ");
		//int i =0;
		for(int i = ch.length-1 ; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
