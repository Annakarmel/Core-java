package com.xworkz.stringMethods.Strings;

public class StringTester {
public static void main(String[] args) {
	

	String str = "Anna";
	String str1 = " Bell";
	
	//are also called objects in java.lang 
	StringBuffer buffer = new StringBuffer("");
	StringBuilder builder = new StringBuilder("");
	
	System.out.println(str.equalsIgnoreCase(str1));
	System.out.println("----------------------------------------------------------------------------");
	
	
	//int length = str.length();
	int length = str1.length();
	System.out.println(length);
	
	System.out.println("----------------------------------------------------------------------------");
	//to find the given String length array without using inbuilt function(length())
	char lgth[] = str.toCharArray();
	int count = 0;
		for (char c : lgth) {
			count++;
			//System.out.print(c);
		}
		System.out.println("Length of array: "+count);
	
	System.out.println("----------------------------------------------------------------------------");
	String perfumes[] = {"Secrete" , "Fogg" , "Yardley" , "Magnet"};
		for (String perfume : perfumes) {
			System.out.println("Perfume name: "+perfume);
		}
	
	System.out.println("----------------------------------------------------------------------------");
	str = str.concat(str1);
	System.out.println(str);
	}
}


