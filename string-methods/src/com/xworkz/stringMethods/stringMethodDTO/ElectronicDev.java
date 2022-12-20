package com.xworkz.stringMethods.stringMethodDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectronicDev {		

	public ElectronicDev() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	private String name;
	private int id;
		
	@Override
	public int hashCode() {
		return this.id;		
	}
	@Override
	public boolean equals(Object obj) {
    ElectronicDev ed=(ElectronicDev)obj;	
    if(this.getName().equals(ed.getName())) {
    	return true;
	    	
    }
    return false;
			
	}
	@Override
	public String toString() {
			
		return "ElectronicDevice-{Name="+this.getName()+",Id="+this.getId()+"}";
	         	
	}

}
