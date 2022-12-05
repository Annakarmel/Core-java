package com.xworkz.practice.Assignments;

public class Charecter {

	public static void main(String[] args) {
		for(int row = 1; row <= 4; row++) {
			for(int col = 1; col <= 4; col++) {
				if(/*row == 2 && col == 2 || row == 3 && col == 2 || row == 2 && col == 3 || row == 3 && col == 3*/col==1 || col==4 || row==1 || row==4) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
