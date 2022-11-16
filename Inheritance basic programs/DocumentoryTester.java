package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.documentory.Documentory;

public class DocumentoryTester {
public static void main(String args[]) {
		
        Documentory doc = new Documentory();
		doc.toWatch("Gandhadhgudi");
		System.out.println(" Dr. puneeth Rajkumar last movie was "  + doc.documentoryName);
	}
}
