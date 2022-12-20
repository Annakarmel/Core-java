package com.xworkz.stringMethods.charToString;

public class CountRepeatedVal {

	public static void main(String[] args) { 
		
        int A[] = { 2, 4, 4, 6, 4, 9, 2, 9, 1, 1 }; 
        int max = Integer.MIN_VALUE; 

        for (int i = 0; i < A.length; i++) { 
            if (A[i] > max) 
                max = A[i]; 
        } 
        
        int B[] = new int[max + 1]; 
        for (int i = 0; i < A.length; i++) { 
            B[A[i]]++; 
        } 

        for (int i = 0; i <= max; i++) { 
            if (B[i] > 1) 
                System.out.println(i + "-" + B[i]); 
        } 
    } 
}
