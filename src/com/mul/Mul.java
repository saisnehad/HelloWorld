package com.mul;

import java.util.Scanner;

public class Mul {
		private static Scanner sc;

		public static void main(String[] args) {
			int x = 0,y = 0;
			int w;
			sc = new Scanner (System.in);
			System.out.println("enter x value: " +x);
			x=sc.nextInt();
			System.out.println("enter y value: " +y);
			y=sc.nextInt();
			w=x*y;
			System.out.println("output for mul: " +w);

	}

}
