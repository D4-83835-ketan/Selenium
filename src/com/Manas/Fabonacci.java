package com.Manas;

public class Fabonacci {

	public static void main(String[] args) {
		 int num = 10;  // Number of terms to print
	        int a = 0, b = 1;int c;
	        //System.out.print("The Fibonacci series: " + a + " " + b);
		System.out.println("The Fabo  series is"+a+""+b);
		for(int i=2;i<num;i++) {
			c=a+b;
			System.out.println(" "+c);
			
			a=b;
			b=c;
			
			
			
		}
		
	}

}
