package com.xworkz.medicalshopapp;

import java.util.Scanner;

import com.xworkz.medicalshopapp.teaStall.*;

// import package+ClassName = FQCN ;

public class TeaStallTester {
	
/*public static void main(String a[]) {
	
	TeaStall ref = new TeaStall();
	System.out.println(ref.name +" "+ ref.ownerName +" "+ ref.teaStallId);
	ref.name = "Chaiwala";
	ref.ownerName ="Musakn";
	ref.teaStallId = 123;
	System.out.println(ref.name +" "+ ref.ownerName);
	
	TeaStall ref1 = new TeaStall(123, "Chaiwala","Muskan");
	System.out.println(ref1.name +" "+ ref1.ownerName +" "+ ref1.teaStallId);
}*/

		public int id;
		public String name;
		public String ownerName;
		
		public TeaStallTester(int id, String name) {
			this.id = id;
			this.name =name;
			//this.ownerName = ownerName;
			
		}
		static {
			System.out.println("Static blocks are executing");
		}
		{
			System.out.println("Init block are executed");
		}
		public static void method() {
			System.out.println("Method of tester class");
		}
		public static void main(String args[]) {
			System.out.println("main method started");
			
			Scanner sc = new Scanner(System.in);
			
			TeaStallTester test = new TeaStallTester(1, "Annakarmel");
			System.out.println(test.name+" "+ test.id);
			System.out.println("main method ended");
		}
}
