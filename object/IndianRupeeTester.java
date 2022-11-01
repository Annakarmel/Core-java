class IndianRupeeTester{

	public static void main(String a[]){
	
	IndianRupee ind = new IndianRupee();
	ind.serialNo = "49A177148";
	ind.color = "Green";
	ind.name = "20 Rupees";
	
	System.out.println(ind.serialNo +" "+ ind.color +" "+ ind.name);
	
	IndianRupee ind1 = new IndianRupee();
	ind1.serialNo = "89A151462";
	ind1.color = "Pink";
	ind1.name = "2000 Rupees";
	
	System.out.println(ind1.serialNo +" "+ ind1.color +" "+ ind1.name);
	}

}