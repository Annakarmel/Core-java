package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.cricketPlayer.CricketPlayer;
import com.xworkz.inheritanceapp.cricketPlayer.Dhoni;

public class CricketPlayerTester {

	
		
		public static void main(String args[]) {
			
			CricketPlayer cr = new CricketPlayer();
			cr.toPlay(400);
			System.out.println("Cricket player runs are" + cr.runs);
			
			Dhoni cr1 = new Dhoni();
			cr1.toPlay(50);
			System.out.println("Runs scored by dhoni is" + cr1.runs);
			
}
}
