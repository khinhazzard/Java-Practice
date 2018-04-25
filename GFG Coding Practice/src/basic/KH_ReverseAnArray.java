package basic;

//1:36 PM 4/10/2018
//1:50 PM 4/10/2018

import java.util.Scanner;

public class KH_ReverseAnArray {

	public static void main(String args[]) {
		int tc;
		Scanner sc = new Scanner(System.in);

		// ask for tc
		System.out.println("Input");
		tc = sc.nextInt();

		while (tc-- > 0) {
			// ask for array size
			int n = sc.nextInt();
			int arr[] = new int[n];
			// fill in the array, integers separated by space or enter
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			// display reversed array
			for (int i = n - 1; i >= 0; i--) {
				System.out.print(arr[i]);
				// add spaces between integers
				if (i > 0)
					System.out.print(" ");
			}
			// add enter every line
			if (tc > 0)
				System.out.println();
		}
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