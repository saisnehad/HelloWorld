package com.div;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		int x, y;
		int r;
		System.out.println("enter x value: ");
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		System.out.println("x value: " + x);
		System.out.println("enter y value: ");
		y = sc.nextInt();

		System.out.println(" y value: " + y);
		r = x / y;
		sc.close();
		System.out.println("output for div: " +'\n' + r);

	}

}
