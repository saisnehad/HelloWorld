package com.sub;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		int x, y;
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x value: ");
		x = sc.nextInt();
		System.out.println("enter y value: ");
		y = sc.nextInt();
		k = x - y;
		sc.close();
		System.out.println("output for sub: " + k);

	}

}
