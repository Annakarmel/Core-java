class Toy{
static int toyId;
static String toyBrand;
static String toyName;
static double toyPrice;
 
 
 	static void setToyId(int id)
	{
	toyId=id ;
	}
	static int getToyId()
	{
	 return toyId;
	}
 
		static void setToyBrand (String brand)
		{
		toyBrand = brand;
		}
		static String getToyBrand()
		{
		return toyBrand;
		}	
 
			static void setToyName(String name)
			{
			toyName = name;
			}
			static String getToyName()
			{
			return toyName;
			}


				static void setToyPrice(double price)
				{
				toyPrice = price;
				}
				static double getToyPrice(){
				return toyPrice;
				}			



}