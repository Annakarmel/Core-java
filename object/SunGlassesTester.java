class SunGlassesTester{

    public static void main(String args[]){
	
	SunGlasses sg = new SunGlasses();
	sg.name = "Sky Wing";
	sg.price = "147rs";
	sg.frameMaterial="fiber";
    sg.size="Free Size";
    sg.toGetProtected();
    System.out.println(sg.name + " "+ sg.price + " "+ sg.frameMaterial + " "+ sg.size);	
	
	SunGlasses sg1 = new SunGlasses();
	sg1.name = "Sunglasses";
	sg1.price = "139rs";
	sg1.frameMaterial="plastic";
    sg1.size="Free Size";
    sg1.toGetProtected();
    System.out.println(sg1.name + " "+ sg1.price + " "+ sg1.frameMaterial + " "+ sg1.size);	
	
	SunGlasses sg2 = new SunGlasses();
	sg2.name = "Retro Cat Eye";
	sg2.price = "155rs";
	sg2.frameMaterial="Acetate";
    sg2.size="Free Size";
    sg2.toGetProtected();
    System.out.println(sg2.name + " "+ sg2.price + " "+ sg2.frameMaterial + " "+ sg2.size);	
	
	
	
	
	
	}




}