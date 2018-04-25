package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/odd-or-even/0

//9:57 PM 4/14/2018
//10:02 PM 4/14/2018

import java.util.Scanner;

public class GFG_12_OddOrEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter an integer
			int n = sc.nextInt();

			// check if odd or even
			check(n);

			if (tc > 0)
				System.out.println();
		}
	}

	static void check(int n) {
		if (n % 2 == 0) {
			System.out.print("even");
		} else {
			System.out.print("odd");
		}
	}
}

/*
 * Given a positive integer determine whether it is odd or even.
 * 
 * Input: First line contains an integer, the number of test cases 'T' Each test
 * case should contain a positive integer N.
 * 
 * 
 * Output: In each seperate line print "odd" if odd and "even" if even.(Dont
 * print the quotes)
 */
