package com.xworkz.encapsulationapp.phone;

public class SmartPhoneDTO {

	private int id;
	private String brand;
	private String storage;
	private double price;
	
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
	
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getStorage() {
		return storage;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}
