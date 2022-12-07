package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;

public class Showroom {

	public Manager manager;
	 
	 public boolean isManager=true;
	 
	 
	 public boolean isManagerInsideShowRoom(Manager manager) {
		 System.out.println("Inside isManagerInsideShowRoom method");
		  boolean isManger=false;
		  if(isManager==true){
			  System.out.println("Manager Detailes");
			  this.manager=manager;
			  manager.dispalyInfo();  
		  }else{
			  System.out.println("Manager is not Avalible");
		  }
		  return isManger; 
	 }
}
