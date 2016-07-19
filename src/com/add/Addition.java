package com.add;

import java.util.*;

public class Addition {

	public static void main(String[] args) {
		int x, y;
		int z, k, c, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x value: ");
		x = sc.nextInt();
		System.out.println("enter y value: ");
		y = sc.nextInt();
		z = x + y;
		k = x - y;
		c = x * y;
		m = x / y;
		sc.close();
		System.out.println("output for add: " + z);
		System.out.println("output for sub: " + k);
		System.out.println("output for mul: " + c);
		System.out.println("output for div: " + m);

	}

}
