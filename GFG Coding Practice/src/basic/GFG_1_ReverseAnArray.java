package basic;

//https:practice.geeksforgeeks.org/problems/reverse-an-array/0/?ref=self
//started at 5:35 PM 4/9/2018
//finished at 6:56 PM 4/9/2018

import java.util.Scanner;

public class GFG_1_ReverseAnArray {

	public static void main(String args[]) {

		int arr[] = new int[100];
		int testCase;
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");
		testCase = sc.nextInt();

		while (testCase --> 0) {

			// array size
			int n = sc.nextInt();
			// enter elements of the array
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			reverse(arr, n);
			// store reversed array into a new array
			int reversed_arr[] = reverse(arr, n);
			// display the reversed array
			display(reversed_arr);
			//adding \n between outputs
			if(testCase>0){
				System.out.printf("\n");
			}
		}
	}

	static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			// adding space between integers
			if (i != arr.length - 1) {
				System.out.print(" ");
			}
		}
	}

	// method for reversing the array
	static int[] reverse(int arr[], int n) {
		int reversed_arr[] = new int[n];

		// iterate the passed array in ascending order
		for (int i = 0; i < n; i++) {
			// store values into a new array in descending order
			reversed_arr[i] = arr[(n-1) - i];
		}
		return reversed_arr;
	}
}
/*
 * Input:
 * 
 * First line contains an integer, the number of test cases 'T' Each test case
 * should contain an integer, size of array 'N' in the first line. In the second
 * line Input the integer elements of the array in a single line separated by
 * space.
 * 
 * Output:
 * 
 * Print the array in reverse order in a single line separated by space.Each
 * array is to be printed in separate line.
 */