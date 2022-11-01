class Furniture{
static int furnitureId;
static String furnitureBrand;  
static String furnitureName;
static double furniturePrice;
 
 
 	static void setFurnitureId(int id)
	{
	furnitureId=id ;
	}
	static int getFurnitureId()
	{
	 return furnitureId;
	}
 
		static void setFurnitureBrand (String brand)
		{
		furnitureBrand = brand;
		}
		static String getFurnitureBrand()
		{
		return furnitureBrand;
		}	
 
			static void setFurnitureName(String name)
			{
			furnitureName = name;
			}
			static String getFurnitureName()
			{
			return furnitureName;
			}


				static void setFurniturePrice(double price)
				{
				furniturePrice = price;
				}
				static double getFurniturePrice(){
				return furniturePrice;
				}			



}