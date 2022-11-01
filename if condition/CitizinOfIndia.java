class CitizinOfIndia{

    public static void showTheResponsibility(){                //(int age,char gender)
	System.out.println("invoked showTheResponsibility");
	 int age = 21;
	 char gender = 'F';
	 if(age >=10 && age<16){
	 //ANA and OR operator
	  System.out.println("Responsibility is school");
      return;	  
	}
     if(age == 16){
	 System.out.println("Responsibility is college");
     return;	 
	}
	if(age == 21)
     {
	   System.out.println("Responsibility is voting");
	   if(gender == 'F'){
		   
		   System.out.println("girl can leggally marry");
	   }
	   else{
		   System.out.println("boy cannot leggally marry");
	   }   
	  }
	  System.out.println("end of showTheResponsibility");
       return;
 
	 }

}