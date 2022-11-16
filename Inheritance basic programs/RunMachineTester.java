package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.runmachine.RunMachine;

public class RunMachineTester {
	
public static void main(String args[]) {
		
        RunMachine run = new RunMachine();
		run.toPlay("Cricket");
		System.out.println(" Virat is good at playing "  + run.name);
	}
}
