//user saisneha
//To print even numbers in 0 to 100
package com.general;

import java.util.Scanner;

public class Evennosin0to100 {

	public static void main(String[] args) {
		int i;
		System.out.println("enter the number to check");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
         
		if (i % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
          sc.close();
	}
}
