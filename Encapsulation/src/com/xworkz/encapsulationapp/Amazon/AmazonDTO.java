package com.xworkz.encapsulationapp.Amazon;

public class AmazonDTO {

	private int id;
	private String productName;
	private int price;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String productName) {
		this.productName = productName;
	}
	public String getName() {
		return productName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
