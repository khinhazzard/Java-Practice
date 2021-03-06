package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/all-divisors-of-a-natural-number/0/?ref=self

//8:53 AM 4/24/2018
//9:06 AM 4/24/2018

import java.util.Scanner;

public class GFG_32_DivisorsOfANum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter num
			int n = sc.nextInt();

			// display all divisors
			divisors(n);

			if (tc > 0)
				System.out.println();
		}
	}

	static void divisors(int n) {
		for (int i = 1; i <= n; i++) {
			// it's a divisor if no remainder
			if (n % i == 0) {
				System.out.print(i);
				// add spaces in between
				if (i < n) {
					System.out.print(" ");
				}
			}
		}
	}
}

/*
 * All divisors of a natural number
 * 
 * Given a natural number n, print all distinct divisors of it including 1 and
 * the number itself.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. The first line of each test case is N, N is the number whose
 * divisors are to be printed.
 * 
 * Output: All the divisors of the given number including 1 and the number
 * itself are displayed in a line with a single space between them in an
 * increasing order.
 */

// Constraints:
// 1 <= T <= 30
// 1 <= N <= 100000
//
// Example:
// Input:
// 3
// 100
// 10
// 125
//
// Output:
// 1 2 4 5 10 20 25 50 100
// 1 2 5 10
// 1 5 25 125