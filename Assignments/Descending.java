package com.xworkz.practice.Assignments;

public class Descending {
public static void dsc(int a[]) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
		//System.out.println("\n\nSorted Order of the array");
		
		for(int i =0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
		
		public static void main(String args[]) {
			int a[] = {5, 42, 6, 54, 875, 63, 23};
			dsc(a);
		}
}
