package com.xworkz.employeeapp.icecream;

public class IcecreamTester {

		public static void main(String a[]) {
			Icecream.companyName = "Arun" ;
			
			Icecream ice = new Icecream("Ahd1256", "ChocoBar" , 25);
			System.out.println(Icecream.companyName);
			System.out.println(ice.icecreamId+" "+ice.icecreamName+" "+ice.icecreamPrice);
		}

}
