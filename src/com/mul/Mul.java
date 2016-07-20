package com.mul;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		int x = 0, y = 0;
		int w;
		System.out.println("enter x value: ");
		Scanner sc = new Scanner(System.in); 
		x = sc.nextInt();
		System.out.println(" x value: " + x);
		System.out.println("enter y value: ");
		y = sc.nextInt();
		System.out.println("enter y value: " + y);
		w = x * y;
		sc.close();
		System.out.println("output for mul: " + w);

	}

}
