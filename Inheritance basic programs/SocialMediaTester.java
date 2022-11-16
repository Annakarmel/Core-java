package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.socialMedia.Instagram;
import com.xworkz.inheritanceapp.socialMedia.SocialMedia;

public class SocialMediaTester {
	
	public static void main(String args[]) {
		
		SocialMedia sm = new SocialMedia();
		sm.toEntertainment("27 billion");
		System.out.println("The max insta followers"+sm.followers);
		
		Instagram insta = new Instagram();
		insta.toEntertainment("758k");
		System.out.println("Instagram followers"+insta.followers);
		
	}
}
