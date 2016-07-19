package com.sub;

import java.util.Scanner;

public class Sub {

	
		private static Scanner sc;

		public static void main(String[] args) {
			int x = 0,y = 0;
			int c;
			sc = new Scanner (System.in);
			System.out.println("enter x value: " +x);
			x=sc.nextInt();
			System.out.println("enter y value: " +y);
			y=sc.nextInt();
			c=x-y;
			System.out.println("output for sub: " +c);
			

		}

	}


