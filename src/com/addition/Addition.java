package com.addition;

import java.util.Scanner;

public class Addition {

	private static Scanner sc;

	public static void main(String[] args) {
		int x = 0,y = 0;
		int z;
		sc = new Scanner (System.in);
		System.out.println("enter x value: " +x);
		x=sc.nextInt();
		System.out.println("enter y value: " +y);
		y=sc.nextInt();
		z=x+y;
		System.out.println("output for add: " +z);
		

	}

}
