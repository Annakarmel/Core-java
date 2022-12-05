package com.xworkz.practice.Assignments;

public class ReverseTester {

	public static void reverse(String data) {
		char newData[] = data.toCharArray();
		
		//char newData[] = {'A','n','n','a','k','a','r','m','e','l', ' ','B','e','l','l','a','r','y'};--> old condition
		
		for(int index = 0; index < newData.length; index++) {
			System.out.print(newData[index]+" ");
		}//--> Printing given data
		
		//index = length-1
		for(int index = newData.length-1; index >= 0; index--) {
			System.out.print(newData[index]+" ");
		}//-->Printing given data into reverse data
		
	}
	
	public static void main(String a[]) {
		reverse("Annakarmel Bellary\n");
		
		/*TASK: 1. revereseMiddleWords("Annakarmel Arogyanathan Bellary");
			    2. convertFirstCharecterToUppercase("my name is annakarmel");
			    3. ascendingOrderDesendingOrder*/
	}
}
