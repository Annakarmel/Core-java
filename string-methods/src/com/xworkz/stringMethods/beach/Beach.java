package com.xworkz.stringMethods.beach;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString //ToString: implicit and explicit
public class Beach {
	
	public Beach() {
		System.out.println(this.getClass().getSimpleName()+ " Object is ceated");
	}

	public int id;
	public String name;
	public String address;
	public int entranceFee;
	
	@Override
	public int hashCode() {
		return this.id;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		//Down casting
		Beach beach = (Beach)obj;
		if(this.getName().equals(beach.getName())) {
			return true;
		}
			return false;	
	}
	
	@Override
	public String toString() {
		return "Beach- [Beach Id = "+this.getId()+", Beach name = "+this.getName()+"]";		
	}
}
