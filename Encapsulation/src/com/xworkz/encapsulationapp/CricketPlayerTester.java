package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.cricketPlayer.CricketPlayerDTO;

public class CricketPlayerTester {

public static void main(String args[]) {
		
		CricketPlayerDTO crc = new CricketPlayerDTO();
		crc.setId(345);
		crc.setName("Virat Kohli");
		crc.setTeamName("India");
		
		System.out.println("player id is " + crc.getId());
		System.out.println("player name is " + crc.getName());
		System.out.println("player team is " + crc.getTeamName());
		
		}

}
