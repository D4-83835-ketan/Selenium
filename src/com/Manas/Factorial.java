package com.Manas;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		num = sc.nextInt();	
		for (int i=1;i<=num;i++) {
			
			fact = fact *i;
			
		}
		System.out.println("The factorial of no is "+fact);

	}

}
