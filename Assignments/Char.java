package com.xworkz.practice.Assignments;

public class Char {

	public static void main(String[] args) {
		for(int row = 0; row <= 4; row++) {
			for(int col = 0; col <= 4; col++) {
				if(row==0 || row==4 || col==0 || col==4 || row==1 && col==1 || row==1 && col==3 || row==2 && col==2 || row==3 && col==1 || row==3 && col==3) {
					System.out.print("#");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		for(int row =0; row <= 4; row++) {
			for(int col = 0; col <= 4; col++) {
				if(row==0 || col ==0 || row==1 && col==1 || row==2 && col==2 || row==3 && col==3 || row==4 && col==4) {
					System.out.print(" # ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		for(int row =0; row <= 4; row++) {
			for(int col =0; col <= 4; col++) {
				if(col==2 && row==0 || col==1 && row==1 || col==3 && row == 1 || col==0 && row==2 || col==4 && row==2 || col==2 && row==2 || col==0 && row==3 || col==4 && row==3 || col==0 && row==4 || col==4 && row==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}
}
