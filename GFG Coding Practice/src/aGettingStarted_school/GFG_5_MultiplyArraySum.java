package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum/0
//created 3:03 PM 4/11/2018
//finished 5:04 PM 4/11/2018

import java.util.Scanner;

public class GFG_5_MultiplyArraySum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");
		// testcases
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// array size
			int n = sc.nextInt();
			int arr[] = new int[n];

			// enter values
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			// divide array into left and right
			int l_arr[] = new int[arr.length / 2];
			int r_arr[] = new int[(arr.length) - (arr.length / 2)];
			// transfer values to both arrays
			int l = 0, r = 0;// counters
			for (int i = 0; i < arr.length; i++) {
				// left array

				if (i < arr.length / 2) {
					l_arr[l] = arr[i];
					l++;
				}
				// right array
				if (i >= arr.length / 2) {
					r_arr[r] = arr[i];
					r++;
				}
			}

			// add their elements individually
			int l_sum = sum_of_elements(l_arr);
			int r_sum = sum_of_elements(r_arr);

			// display product of both array
			System.out.print(l_sum * r_sum);
			if (tc > 0)
				System.out.println();
		}
	}

	// function for adding up all elements in the array
	static int sum_of_elements(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

/*
 * Pitsy needs help in the given task by her teacher. The task is to divide a
 * array into two sub array (left and right) containing n/2 elements each and do
 * the sum of the subarrays and then multiply both the subarrays.
 * 
 * Input: First line consists of T test cases. Only line of every test case
 * consists of an integer N.
 * 
 * Output: print the answer by dividing array into left and right array and add
 * their elements individually and then multiply both the array
 */
