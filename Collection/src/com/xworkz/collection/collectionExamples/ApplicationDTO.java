package com.xworkz.collection.collectionExamples.application;

public class ApplicationDTO {

	private String name;
	private double price;
	private String developedBy;
	private double version;
	private boolean free;
	
	public ApplicationDTO() {
		super();
	}
	
	public ApplicationDTO(String name, double price, String developedBy, double version, boolean free) {
		super();
		this.name = name;
		this.price = price;
		this.developedBy = developedBy;
		this.version = version;
		this.free = free;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", price=" + price + ", developedBy=" + developedBy + ", version="
				+ version + ", free=" + free + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!= null) {
			
			if(obj instanceof ApplicationDTO) {
				ApplicationDTO dto = (ApplicationDTO)obj;
				
				if(dto.developedBy.equals(this.developedBy)) {
					System.out.println(this.developedBy);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	
	
	
	
}
