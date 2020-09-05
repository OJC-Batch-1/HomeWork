package com.onlinejava;

import java.util.Scanner;

public class SecondMaxSalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Elements of array :");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if (n >= 2) {
			int sndmax = findSndMax(a);
			System.out.println("Second Maximum Salary : " + sndmax);
		} else {
			System.out.println("Not Possible to find second max element.");
		}

	}

	private static int findSndMax(int[] arr) {
		int n = arr.length, max = Integer.MIN_VALUE, sndmax = max;
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				sndmax = max;
				max = arr[i];
			} else {
				if (sndmax < arr[i])
					sndmax = arr[i];
			}
		}
		return sndmax;
	}

}
