package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/sum-of-an-ap/0/?ref=self
//5:48 PM 4/19/2018
//6:12 PM 4/19/2018

import java.util.Scanner;

public class GFG_24_SumOfAnAP {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// get n, t, and d
			int n = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();

			int sum = 0;
			// compute sum of AP
			for (int i = 0; i < n; i++) {
				if(i>=1){
					t += d;
				}
				sum += t;
			}

			System.out.print(sum);
			
			if (tc > 0)
				System.out.println();
		}
	}
}

/*
 * Write a program to print sum of an AP with n terms with first term a and
 * common difference d.
 * 
 * Input:
 * 
 * The first line of the input contains T denoting the number of testcases. The
 * first line of the test case will be the number of terms of AP and second line
 * its first term and common difference. Output:
 * 
 * For each test case, output will be the sum of AP
 */

// AP - arithmetic progression

// formula: n = number of series digits
// t = starting term
// d = difference between numbers

// Example:
//
// Input:
//
// 1
// 5
// 1 3
//
// Output:
//
// 35

// 5 numbers: 1 + 4 + 7 + 10 + 13 = 35
// 1 starting term
// 3 difference of numbers