class SwapThreeNumbers{

       public static void main(String anu[]){
	   
	   int x = 15;
	   int y = 10;
	   
	   System.out.println("Before the swaping");	   
	   System.out.println("x is " + x);	   
	   System.out.println("y is " + y);
	   
	   x = x + y;	   
	   y = x - y;	   
	   x = x - y;
	   
	   System.out.println("After the swaping");	   
	   System.out.println("x is " + x);	   
	   System.out.println("y is " + y);
	   
	}

}