package com.dsa.arrays;

public class Find3MinFormArray {

	public static void main(String[] args) {
		int a[] = { 32, 58, 43, 64, -2, 11, 69, 27 };

		for (int i = 0; i < a.length; i++) {
			int min = a[i], position=-1,isChange = 0;

			for (int j = i; j < a.length; j++) {
				if (min > a[j]) {
					min = a[j];
					position = j;
					isChange = 1;
				}
			}
			if (isChange == 1) {
				int temp = a[i];
				a[i] = a[position];
				a[position] = temp;
			}
			isChange = 0;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + ",");
		}

	}

}
