package com.xworkz.showroomapp;

import java.util.Scanner;

import com.xworkz.showroomapp.constant.Gender;
import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.TataShowroom;

public class TataShowroomTester  {

public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size");
		int size =sc.nextInt();
		
		TataShowroom tata= new TataShowroom();
		
		for(int i=0;i<size;i++) {
			
			Manager manage=new Manager();
			
			System.out.println("Enter Manager name");
			manage.setName(sc.next());
			
			System.out.println("Enter Manager age");
			manage.setAge(sc.nextInt());
			
			System.out.println("Enter Manager gender");
			String gender=sc.next();
			manage.setGender(Gender.valueOf(gender));
			
			System.out.println("Enter Manager id");
			manage.setId(sc.nextInt());
			
			tata.addManager(manage);		
		}
		
		  tata.getAllMangers();
		    
		  System.out.println("manager detalis by  enter name");
		  tata.getManagersDetailsByName(sc.next());  
		  
		  System.out.println("get manager detalis by  enter age");
		  tata.getManagerByage(sc.nextInt());
		  
		  System.out.println("get manager detalis by  enter gender");
		  String gender = sc.next();
		  tata.getManagerByGender(Gender.valueOf(gender));	  
		  
		  System.out.println("get manager detalis by enter id");
		  String gender1 = sc.next();
		  tata.getManagerByGender(Gender.valueOf(gender1));
		  
		  System.out.println("get manager nmae by entering id");
		  tata.getManagerByage(sc.nextInt());
		  
		  System.out.println("get manager id by entring name");
		  tata.getManagerIdbyNmae(sc.next());	  
		  
		  System.out.println("update Managera Id By ENTER Name");
		  String name =sc.next();
		  int id=sc.nextInt();
		  tata.updateManageraIdByName(name, id);
		  	  
		  System.out.println("update Managera name By ENTER id");
		  int Id=sc.nextInt();
		  String Name=sc.next();
		  tata.updateManagerNameById(Id, Name);
		  		  
		  System.out.println("deleted Manager By name");
		  String num=sc.next();
		  tata.deletedManagerByname(Name);
		  
		  tata.getNewManagerName();
	}
}
