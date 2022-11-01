class CromaTester{

      public static void main(String args[]){
	  
	  Croma dev = new Croma();
	  dev.device = "Laptop";
	  dev.brand = "Lenovo";
	  dev.price = 55000;
	  dev.type = "Screen touch";
	  dev.toGetElectronicDevices();
	  System.out.println(dev.device + " "+ dev.brand + " "+ dev.price + " "+ dev.type);
	  
	  Croma dev1 = new Croma();
	  dev1.device = "Washing Machine";
	  dev1.brand = "Whirlpool";
	  dev1.price = 10000;
	  dev1.type = "Top loading";
	  dev1.toGetElectronicDevices();
	  System.out.println(dev1.device + " "+ dev1.brand + " "+ dev1.price + " "+ dev1.type);
	  
	  Croma dev2 = new Croma();
	  dev2.device = "Air Conditioner";
	  dev2.brand = "Panasonic";
	  dev2.price = 34000;;
	  dev2.type = "Split";
	  dev2.toGetElectronicDevices();
	  System.out.println(dev2.device + " "+ dev2.brand + " "+ dev2.price + " "+ dev2.type);
	  
	  
	  
	  
	  
	  
	  }




}