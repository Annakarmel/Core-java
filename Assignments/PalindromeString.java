package com.xworkz.practice.Assignments;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "";
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String strg = sc.next();
		char[] ch = strg.toCharArray();
		
		for(int i = ch.length-1 ; i >= 0; i--) {
			System.out.print(ch[i]);
			str = str + ch[i];
		}
		if(strg.equals(str)) {
			System.out.println(" It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}
}
