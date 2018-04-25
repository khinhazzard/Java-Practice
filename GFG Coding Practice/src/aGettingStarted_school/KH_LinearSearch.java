package aGettingStarted_school;

//https://www.geeksforgeeks.org/how-to-begin-with-competitive-programming/
//A Sample Java program for beginners with Competitive Programming

import java.util.Scanner;

;

class KH_LinearSearch {

	public static void main(String[] args) {
		// Note that size of arr[] is considered 100 according to
		// the constraints mentioned in problem statement.
		int[] arr = new int[30]; //max size of the array
		int testCase;
		Scanner sc = new Scanner(System.in);

		// Input the number of test cases you want to run
		System.out.print("Test Case:");
		testCase = sc.nextInt();

		// One by one run for all input test cases
		int c=0;
		while (c < testCase) {

			// Input the size of the array
			System.out.printf("Test Case #%d\n",c+1);
			System.out.print("Array size:");
			int n = sc.nextInt();

			// Input the array
			// numbers can be put into an array individually by separating it
			// with "spaces" or "enter"
			System.out.printf("Enter %d numbers for Array\n", n,n-1);
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// Input the element to be searched
			System.out.print("Search a number:");
			int k = sc.nextInt();
			// Compute and print result
			if(search(arr,n,k)==-1){
				System.out.printf("%d is not found in the Array!\n",k);	
			}else{
				System.out.printf("%d is found at arr[%d]\n",k,search(arr, n, k));
			}
			c++;
		}
	}
	
	// This function returns index of element x in arr[]
	private static int search(int arr[], int n, int k) {

		for (int i = 0; i < n; i++) {
			// Return the index of the element if the element
            // is found
			if(k == arr[i])
				return i;
		}
		//element is not found
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

