class Palindrome{
	
	public static void main(String anu[]){
	
	int n = 121, rev = 0;
	int temp = n;
	
	while(n > 0){
	int rem = n % 10;
	rev = (rev * 10) + rem;
	n = n / 10;
	}
		if(temp == rev){
			System.out.println("Number is palindrome" + rev);
			}
		else{
			System.out.println("Number is not palindrome");
			}
	}
	}