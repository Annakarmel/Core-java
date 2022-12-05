package com.xworkz.practice.Assignments;

public class StringProgram {

	public static void main(String[] args) {
		String name = "Java Programming";
		System.out.println(name);
	
		//in built
		for(int i= 0; i < name.length(); i++) {
			System.out.print(" "+name.charAt(i));
			}
		System.out.println("\nString reverse");
		for(int i =name.length()-1; i>=0; i--) {
			System.out.print(" "+name.charAt(i));
			}
		//counting a given char
		int count = 0;
		int count1 = 0;
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) =='a') {
				count+= 1;
			}
			else {
				count1 ++;
			}
		}
		System.out.println("\ncount: "+count);
		System.out.println("Remaining count: "+count1);
		
		
		//String reverse without using charAt()
		int count2 = 0;
		int count3 = 0;
		String str = "sneha is a shorty";
		for(char ch:str.toCharArray()) {
			if(ch == 's') {
				count2+=1;
			}
			else {
				count3 ++;
			}
			System.out.print(ch+" ");
		}
		System.out.println("\nCount: "+count2);
		System.out.println("Remaining count: "+count3);
		
		String nm = "anu";
		String reverse = "";
		//System.out.println(nm);
		
		for(int i = 0; i < nm.length(); i++) {
			System.out.print(" "+nm.charAt(i));
		}
		System.out.println("\nReverse name");
		for(int i = nm.length()-1; i >= 0; i--) {
			reverse+=nm.charAt(i);
			System.out.print(" "+nm.charAt(i));
		}
		if(nm.equals(reverse)) {
			System.out.println("matched");
		}	
		else {
			System.out.println("\nNot matched");
		}
	}
	
}
