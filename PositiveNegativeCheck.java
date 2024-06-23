package com.java.firstDay;

import java.util.Scanner;

public class PositiveNegativeCheck {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter a Number");
	int num =scan.nextInt();
	if(num<0) {
		System.out.println("Negative number");
	}
	else {
		System.out.println("Positive number");
	}
}
}
