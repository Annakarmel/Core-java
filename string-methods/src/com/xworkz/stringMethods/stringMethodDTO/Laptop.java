package com.xworkz.stringMethods.stringMethodDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop {

	public Laptop() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	private String name;
	private int price;
		
	@Override
	public int hashCode() {
		return this.price;		
	}
	@Override
	public boolean equals(Object obj) {
    Laptop lp=(Laptop)obj;	
    if(this.getName().equals(lp.getName())) {
    	return true;
	    	
    }
    return false;
			
	}
	@Override
	public String toString() {
			
		return "ElectronicDevice-{Name="+this.getName()+",Id="+this.getPrice()+"}";
	         	
	}
}
