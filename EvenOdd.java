package com.java.firstDay;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
		if(n%2==0) {
			System.out.println(n+" is Even");
		}
		else {
			System.out.println(n+" is 13Odd");
		}
	}
}
