class Vessel{
	static int vesselId;
	static String vesselName;
	static String vesselBrand;
	static double vesselPrice;
   
   	static void setvesselId(int id)
	{
	vesselId=id ;
	}
	static int getVesselId()
	{
	 return vesselId;
	}
 
	static void setVesselName (String name)
	{
	vesselName = name;
	}
	static String getVesselName()
	{
	return vesselName;
	}	
 
	static void setVesselBrand(String brand)
	{
	vesselBrand = brand;
	}
	static String getVesselBrand()
	{
	return vesselBrand;
	}


	static void setVesselPrice(double price)
	{
	vesselPrice = price;
	}
	static double getVesselPrice(){
	return vesselPrice;
	}			
 
 }



