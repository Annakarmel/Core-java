package com.xworkz.stringMethods.stringMethodDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {
	
		public Vehicle(){
			System.out.println(this.getClass().getSimpleName()+"object is created");
		}
		
		private int id;
		private String name;
		
		@Override
		public int hashCode() {
			return this.id;
		}
		
		@Override
		public boolean equals(Object obj) {
			Vehicle tp=(Vehicle) obj;
			if(this.getName().equals(tp.getName())) {
				return true;
				
			}
			return false;
			
		}
		@Override
		public String toString() {
			return "Vehicle - {Id="+this.getId()+",Name="+this.getName()+"}";
		}
}
