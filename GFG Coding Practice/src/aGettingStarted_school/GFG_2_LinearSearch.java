package aGettingStarted_school;

//created at 3:36 PM 4/9/2018
//https://www.geeksforgeeks.org/how-to-begin-with-competitive-programming/
//A Sample Java program for beginners with Competitive Programming

import java.util.Scanner;

public class GFG_2_LinearSearch {
	public static void main(String args[]) {

		int arr[] = new int[100]; // max array size
		int testCase;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input:"); // remove this when running at GFG
		testCase = sc.nextInt();

		int display_output = testCase; // counter for displaying output later on
		int output[] = new int[testCase]; // max output = no. of testcases

		while (testCase > 0) {
			int n = sc.nextInt(); // for array size
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt(); // numbers for the array
			}

			int k = sc.nextInt(); // number to be searched

			output[testCase - 1] = search(arr, n, k);

			testCase--;
		}

		System.out.println("Output:"); // remove this when running at GFG
		while (display_output > 0) {
			System.out.println(output[display_output - 1]);
			display_output--;
		}

	}

	// function for searching a number in the array
	private static int search(int arr[], int n, int k) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == k)
				return i;
		}
		return -1;
	}

}
/*
 * Problem Statement: Linear Search: Given an integer array and an element x,
 * find if element is present in array or not. If element is present, then print
 * index of its first occurrence. Else print -1.
 * 
 * Input: First line contains an integer, the number of test cases ‘T’. Each
 * test case should be an integer. Size of the array ‘N’ in the second line. In
 * the third line, input the integer elements of the array in a single line
 * separated by space. Element X should be inputted in the fourth line, i.e.,
 * after entering the elements of array. Repeat the above steps second line
 * onwards for multiple test cases.
 * 
 * Output: Print the output in a separate line returning the index of the
 * element X. If the element is not present, then print -1.
 */

