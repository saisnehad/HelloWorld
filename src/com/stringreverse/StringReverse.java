package com.stringreverse;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println("enter string: ");

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s);
		String sb = new StringBuilder(s).reverse().toString();
		scan.close();
		System.out.println(sb);

	}
}
