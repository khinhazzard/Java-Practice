package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/second-largest/0

//11:19 AM 4/24/2018
//11:37 AM 4/24/2018

import java.util.Scanner;

public class GFG_37_FindSecondLargest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter array size
			int arr[] = new int[sc.nextInt()];

			int l = 0;
			int sec_l=0;

			// enter array elements
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

				// largest found
				if (arr[i] > l) {
					sec_l = l;
					l = arr[i];
				}
				//second largest
				if(arr[i] < l && arr[i]>sec_l){
					sec_l = arr[i];
				}
				
			}

			// find second largest
			// display result
			System.out.print(sec_l);

			if (tc > 0)
				System.out.println();
		}
	}

}

/*
 * Given an array, return second largest element from an array.
 * 
 * Input:
 * 
 * The first line of input contains an integer T denoting the number of test
 * cases. The first line of each test case is N,N is the size of array. The
 * second line of each test case contains N input C[i].
 */

// Example:
//
// Input
// 2
// 5
// 89 24 75 11 23
// 6
// 56 42 21 23 65 20
//
// Output
// 75
// 56