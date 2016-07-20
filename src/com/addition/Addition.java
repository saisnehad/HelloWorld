package com.addition;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int x, y;
		int z;
		System.out.println("enter x value: ");
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		System.out.println("x value: " + '\n' + x);
		System.out.println("enter y value: ");
		y = sc.nextInt();
		System.out.println("y value: " +'\n' + y);
		z = x + y;
		sc.close();
		System.out.println(" add: " + '\n' + z);

	}

}
