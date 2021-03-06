package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0

//9:19 AM 4/24/2018
//9:36 AM 4/24/2018

import java.util.Scanner;

public class GFG_33_ImmediateSmallerElement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter array size
			int size = sc.nextInt();

			int arr[] = new int[size];

			// array elements
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			
			// display result
			for (int i = 0; i < arr.length; i++) {
				// check if this is the last index
				if(i == arr.length-1){
					System.out.print(-1);
					break;
				}
				// check next element if smaller
				System.out.print(check(arr[i], arr[i+1]));
				
				if (i < arr.length - 1)
					System.out.print(" ");
			}

			if (tc > 0)
				System.out.println();
		}
	}
	
	static int check(int current, int next){
		if(next < current){
			return next;
		}
		else{
			return -1;
		}
	}
}

// Immediate Smaller Element

/*
 * Given an integer array, for each element in the array check whether there
 * exist a smaller element on the next immediate position of the array. If it
 * exist print the smaller element. If there is no smaller element on the
 * immediate next to the element then print -1.
 * 
 * Input:
 * 
 * The first line of input contains an integer T denoting the number of test
 * cases. The first line of each test case contains an integer N, where N is the
 * size of array. The second line of each test case contains N integers sperated
 * with a space which is input for the array arr[ ]
 * 
 * Output:
 * 
 * For each test case, print in a newline the next immediate smaller elements
 * for each element in the array.
 */

// Example:
//
// Input
// 2
// 5
// 4 2 1 5 3
// 6
// 5 6 2 3 1 7
//
// Output
// 2 1 -1 3 -1
// -1 2 -1 1 -1 -1