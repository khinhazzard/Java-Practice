package aGettingStarted_school;
//started 9:16 PM 4/10/2018
//finished at 10:08 PM 4/10/2018

/*Result from: https://practice.geeksforgeeks.org/problems/sort-the-array/0
 *  Your program took more time than expected.Time Limit Exceeded
 *  Expected Time Limit < 0.64sec
 *  Hint : Please optimize your code and submit again.
 */

import java.util.Scanner;

public class KH_SelectionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// ask for testcase
		System.out.println("Input");
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// ask for array size
			int n = sc.nextInt();
			int arr[] = new int[n];
			// fill in the array
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// sort the array
			arr = selectionSort(arr);

			// display sorted array
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i < arr.length - 1) {
					// adds spaces between integers
					System.out.print(" ");
				}
			}
			// adds newline between testcases
			if (tc > 0) {
				System.out.println();
			}
		}
	}

	static int[] selectionSort(int arr[]) {
		// int sorted_arr[] = new int[arr.length];
		int temp, j;

		// linear iteration
		for (int i = 0; i < arr.length; i++) {

			// find index of minimum element in the arr[]
			j = index_of_min(arr, i);

			// switch it with arr[i]
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	// function for finding index of minimum value
	static int index_of_min(int arr[], int i) {
		int index = i;

		for (int j = i; j < arr.length; j++) {
			if (arr[j] < arr[index]) {
				index = j;
			}
		}
		return index;
	}
}