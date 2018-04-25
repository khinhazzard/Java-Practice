package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/ab-set-1/0

//4:39 PM 4/15/2018
//4:45 PM 4/15/2018

import java.util.Scanner;

public class GFG_16_ApowerB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		// testcase
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// ask for two numbers
			int a = sc.nextInt();
			int b = sc.nextInt();

			
			// just convert double to long then print
			long r = Math.round(Math.pow(a, b));

			System.out.print(r);

			if (tc > 0)
				System.out.println();
		}
	}
}

/*
 * a^b (Set 1)
 * 
 * For two given positive numbers a and b. Find a^b.
 * 
 * Input: The first line contains an integer 'T' denoting the total number of
 * test cases. In each test cases, there are two numbers a and b.
 * 
 * 
 * Output: Find a^b.
 */