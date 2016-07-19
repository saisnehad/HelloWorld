package com.div;

import java.util.Scanner;

public class Div {

		public static void main(String[] args) {
			int x = 0,y = 0;
			int r;
			Scanner sc = new Scanner (System.in);
			System.out.println("enter x value: " +x);
			x=sc.nextInt();
			System.out.println("enter y value: " +y);
			y=sc.nextInt();
			r=x/y;
			sc.close();
			System.out.println("output for div: " +r);

	}

}
