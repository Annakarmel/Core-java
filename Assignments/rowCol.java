package com.xworkz.practice.Assignments;

public class rowCol {

	public static void main(String[] args) {
		//if(condition || condition2)
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if(row == 5 && col == 1) {
				System.out.print("Anu");
				}
				else {
					System.out.print(col);
				}
			}
			System.out.println();
		}
	}
}
