package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/count-alphabets/0

//7:51 AM 4/24/2018
//8:07 AM 4/24/2018

import java.util.Scanner;

public class GFG_28_CountAlphabets {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");

		int tc = Integer.parseInt(sc.nextLine());

		while (tc-- > 0) {
			// enter a string
			String s = sc.nextLine();

			// count number of alphabets in the string

			// print result
			System.out.print(countAlphabet(s));

			if (tc > 0)
				System.out.println();
		}
	}

	static int countAlphabet(String s) {
		int r = 0;

		// check each character
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				r++;
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				r++;
			}
		}
		return r;
	}
}

/*
 * Given a string, print the number of alphabets present in the string.
 * 
 * Input:
 * 
 * The first line of input contains an integer T denoting the number of test
 * cases. The description of T test cases follows.Each test case contains a
 * single string.
 * 
 * 
 * Output:
 * 
 * Print the number of alphabets present in the string.
 */

// Constraints:
//
// 1<=T<=30
//
// 1<=size of string <=100
//
//
// Example:
//
// Input:
//
// 2
// adjfjh23
// njnfn_+-jf
//
// Output:
//
// 6
// 7