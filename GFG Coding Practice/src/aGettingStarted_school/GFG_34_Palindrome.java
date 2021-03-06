package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/palindrome/0/?ref=self

//9:40 AM 4/24/2018
//9:56 AM 4/24/2018

import java.util.Scanner;

public class GFG_34_Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter num
			int n = sc.nextInt();

			// check if palindrome
			// display result
			if (checkPalindrome(n)) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}

			if (tc > 0)
				System.out.println();
		}
	}

	static boolean checkPalindrome(int n) {
		// convert num to string
		String s = Integer.toString(n);

		// reverse the string
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}

		// convert to int
		int rev = Integer.parseInt(reversed);

		// compare to n
		if (rev == n) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * Given an integer, check whether it is a palindrome or not. Input: The first
 * line of input contains an integer T denoting the number of test cases. Then T
 * test cases follow. Each test case consists of a single line. The first line
 * of each test case contains a single integer N to be checked for palindrome.
 * 
 * Output: Print "Yes" or "No" (without quotes) depending on whether the number
 * is palindrome or not.
 */

//
// Example:
// Input:
// 3
// 6
// 167
// 55555
//
// Output:
// Yes
// No
// Yes