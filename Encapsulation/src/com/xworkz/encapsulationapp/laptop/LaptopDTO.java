package com.xworkz.encapsulationapp.laptop;

public class LaptopDTO {

	private int id;
	private String brand;
	private String processor;
	
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
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getProcessor() {
		return processor;
	}

}
