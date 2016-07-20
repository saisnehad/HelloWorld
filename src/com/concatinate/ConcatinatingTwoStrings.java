package com.concatinate;

import java.util.Scanner;

public class ConcatinatingTwoStrings {

	public static void main(String[] args) {
		System.out.println("enter first string: ");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		System.out.println("enter second string: ");
		String s2 = s.nextLine();
		s.close();
		System.out.println(s1.concat(s2));

	}

}
