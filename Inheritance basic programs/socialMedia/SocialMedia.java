package com.xworkz.inheritanceapp.socialMedia;

public class SocialMedia {
	public String followers;
	
	public void toEntertainment(String followers) {
		System.out.println("Instagram is the most favorite media");
		this.followers = followers;
	}
}
