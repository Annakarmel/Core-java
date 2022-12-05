package com.xworkz.practice.Assignments;

public class ReverseMiddleWords {
	public static void printMiddleWordReverse(String a) {
		
		//print the first word
		for(int index = 0; index < a.length() && a.charAt(index) != ' '; index++) 
			System.out.print(a.charAt(index));
		
		//print middle word
		String word = "";
		
		for(int index = 2; index < a.length(); index++) {
			
			if(a.charAt(index) != ' ')
				word += a.charAt(index);
			else {
				System.out.print(new StringBuilder(word).reverse().toString() + " ");
				word = "";
			}
		}
		
		//Print the last word
		System.out.print(word + " ");
	}
	
	public static void main(String args[]) {
		String a = "My name is Annakarmel";
		printMiddleWordReverse(a);
	}
}
