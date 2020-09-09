package com.onlinejava;

import java.util.Scanner;

public class ArrayAssignment {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayAssignment as = new ArrayAssignment();
		
		System.out.println("1. Remove Element from Array.");
		as.removeElement();
		System.out.println("\n2. Insert element in Array.");
		as.insertElement();
		System.out.println("\n3. Duplicates element count.");
		as.findDuplicatesElementCount();
		System.out.println("\n4. Sum of 2 Matrices.");
		as.sumOfMatrices();
		
	}

	private  void removeElement() {
		int[] a = createArray();
		System.out.print("Enter element to delete from array : ");
		int del = sc.nextInt();
		
		System.out.println("After deletion : ");
		for(int i = 0; i<a.length; i++) {
			if(a[i] == del) {
				continue;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	private  int[] createArray() {
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.print("Enter elements of array : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	private void insertElement() {
		System.out.print("Enter capacity of array : ");
		int capacity = sc.nextInt();
		int[] arr = new int[capacity];
		System.out.print("Enter no. of elements in array : ");
		int n = sc.nextInt();
		
		System.out.print("Elements of array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter a new element : ");
		int num = sc.nextInt();
		System.out.print("Enter index at which new element is inserted : ");
		int index = sc.nextInt();	
		
		int len = arr.length;
		if (index < n) {
			for (int i = n; i > index; i--) {
				arr[i] = arr[i - 1];
			}
			arr[index] = num;
		}
		for (int i = 0; i < n + 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private void findDuplicatesElementCount() {
        int[] a = createArray();
        int n = a.length, count = 0;
		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[j] == -1) {
					continue;
				}
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}

			}
			if (count > 1) {
				System.out.println(a[i] + " appears " + count + " times");
			}
		}
		System.out.println();
	}
	

	private void sumOfMatrices() {
		System.out.print("Enter row and column of matrices : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		System.out.println("Enter elements in matrix1 : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements in matrix1 : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		sum(arr1, arr2, row, col);
	}

	private void sum(int[][] arr1, int[][] arr2, int row, int col) {
		int a[][] = new int[row][col];
		System.out.println("Addition of two matrices .");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}		
	}

}
