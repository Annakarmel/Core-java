package com.xworkz.practice.Assignments;

public class Ascending {

	public static void asc(int a[]) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
					
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
		
		public static void main(String args[]) {
			
			System.out.println("Enter the number");
			int a[] = {56, 65, 686, 654, 545};
			asc(a);
		
	}
}
