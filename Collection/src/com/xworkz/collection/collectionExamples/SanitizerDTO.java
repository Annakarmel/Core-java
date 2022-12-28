package com.xworkz.collection.collectionExamples;

public class SanitizerDTO {

	private int id;
	private String brand;
	private double price;
	private String color;
	
	public SanitizerDTO() {
		
	}
	
	public SanitizerDTO(int id, String brand, double price, String color) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Sanitizer - [id - " + this.getId() + "brand- " + this.getBrand() + "price- " + this.getPrice() +
				                      "color- " + this.getColor() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	public int compareTo() {
		return 0;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

}


