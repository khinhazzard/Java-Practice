package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/print-elements-of-array/0

//9:48 PM 4/14/2018
//9:55 PM 4/14/2018

import java.util.Scanner;

public class GFG_11_PrintElementsOfArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// ask for array size
			int n = sc.nextInt();
			int arr[] = new int[n];

			// enter array elements
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			//display elements in the array
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]);
				
				//add spaces in between integers
				if(i<arr.length)
					System.out.print(" ");
			}

			if (tc > 0)
				System.out.println();
		}
	}
}

/*
 * Given an array, print all its elements.
 * 
 * Input:
 * 
 * The first line of the input contains T denoting the total number of
 * testcases. The first line of each testcase contains N denoting the size of
 * array. The second line contains N space separated positive integers denoting
 * the elements of array.
 * 
 * 
 * Output:
 * 
 * For each testcase, print all its element in new line.
 */