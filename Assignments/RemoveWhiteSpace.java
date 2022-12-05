package com.xworkz.practice.Assignments;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ') {
				System.out.print(ch[i]);
			}
		}
	}
}
