package aGettingStarted_school;

//https://ide.geeksforgeeks.org/ <- to execution time & memory

///https://practice.geeksforgeeks.org/problems/sum-of-array-elements/0/?ref=self
//started at 4:31 PM 4/9/2018
//finished at 5:25 PM 4/9/2018
import java.util.Scanner;

public class GFG_1_SumofArrayElements {

	public static void main(String args[]) {

		int arr[] = new int[100];
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");
		int testCase = sc.nextInt();
		int output[] = new int[testCase];
		int display = testCase;

		while (testCase > 0) {
			// ask for array size
			int n = sc.nextInt();
			// fill in the array
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// compute sum in the array
			output[testCase - 1] = sum(arr, n);

			// loop ender
			testCase--;
		}

		System.out.println("Output");

		while (display > 0) {
			System.out.println(output[display - 1]);
			display--;
		}
	}

	// method for computing sum
	static int sum(int arr[], int n) {
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += arr[i];
		}
		return total;
	}
}

/*
 * 
 * Given an integer array, find sum of elements in it.
 * 
 * Input:
 * 
 * First line contains an integer denoting the test cases 'T'. Every test case
 * contains an integer value depicting size of array 'N' and N integer elements
 * are to be inserted in the next line with spaces between them.
 * 
 * Output:
 * 
 * Print the sum of all elements of the array in separate line.
 */