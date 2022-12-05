class ReverseNumber{

      public static void main(String anu[]){
	  
	  int num = 4567, rev = 0;	  
	  System.out.println("the original number : " + num);
	  
	  while(num != 0){	  
	  int digit = num % 10;	  
	  rev = rev * 10 + digit;	  
	  num = num / 10;	  
	}
	
	   System.out.println("the Rev number : " + rev);
	  
   }

}