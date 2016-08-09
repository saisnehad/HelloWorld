package com.arrays;

public class Twodimensionalarray {

	public static void main(String[] args) {

		int arr[][] = new int[3][2];

		arr[0][0] = 32;
		arr[0][1] = 45;
		arr[1][0] = 76;
		arr[1][1] = 94;
		arr[2][0] = 54;
		arr[2][1] = 92;
		for (int i = 0; i <3  ; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println(arr[i][j]);

			}

		}

	}

}
