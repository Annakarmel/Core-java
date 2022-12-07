package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.constant.Gender;
import com.xworkz.showroomapp.manager.Manager;

public class TataShowroom extends Showroom{

	public Manager[] managers;
	int index;
	public Manager[] newManager;
	
	public void TataShowRoom(int size){
		managers=new Manager[size];
	}
	
	public boolean addManager(Manager manager) {
		System.out.println("inside add manager method");
		boolean isMangeradded=false;
		if(manager!=null) {
			System.out.println("manager detiales are added");
			managers[index++]=manager;
			isMangeradded=true;
		}
		System.out.println("end manager method");
		return isMangeradded;
	}
	
	public void getAllMangers() {
		System.out.println("List of mangers are");	
		for(int i=0;i<managers.length;i++){
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
	}
	
	public void getManagersDetailsByName(String managerName){
		for(int i=0;i<managers.length;i++){
		if(managers[i].getName().equals(managerName)) {
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
			}
		}
	}

	public void getManagerById(int managerId){
		for(int i=0;i<managers.length;i++){
		if(managers[i].getId() == managerId) {
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
			}
		}
	}
	
	public void getManagerByage(int managerAge){	
		for(int i=0;i<managers.length;i++){
		if(managers[i].getAge()==(managerAge)) {
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
			}
		}
	}
		
	public void getManagerByGender(Gender gender){
		for(int i=0;i<managers.length;i++){
		if(managers[i].getGender().equals(gender)) {
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
			}
		}
	}
	
	public void getManagerNameById(int managerid){	
		for(int i=0;i<managers.length;i++){
		if(managers[i].getId()== managerid) {
			System.out.println("Manager Name : "+managers[i].getName());
			}
		}
	}
	
	public void getManagerIdbyNmae(String managername){
		for(int i=0;i<managers.length;i++){
		if(managers[i].getName().equals(managername)) {
			System.out.println("Manager id : "+managers[i].getId());		
			}
		}
	}

	//update
	public boolean updateManageraIdByName(String name, int newManagerId) {
		boolean isUpdated=false;	
		System.out.println("inside update manger Id  by name");	
		for(int i=0;i<managers.length;i++){
			if(managers[i].getName().equals(name)) {
				managers[i].setId(newManagerId);
			}	
		}
		return isUpdated;
	}
	
	public boolean updateManagerNameById(int id ,String newManagerName) {
		boolean isUpdated=false;
		System.out.println("inside update manger  name by id");	
		for(int i=0;i<managers.length;i++){	
			if(managers[i].getId() == id){
				managers[i].setName(newManagerName);
			}
		}
		return isUpdated;
	}
	
	
	public boolean deletedManagerByname(String name) {
		boolean isDeleated=false;
		for(int i=0,k=0;i<managers.length;i++) {
			if(!managers[i].getName().equals(name)){
				newManager[k++]=managers[i];
				isDeleated=true;
			}	
		}
		return isDeleated;	
	}
	
	public void getNewManagerName(){
		for(int i=0;i<newManager.length;i++) {
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
	}
}

