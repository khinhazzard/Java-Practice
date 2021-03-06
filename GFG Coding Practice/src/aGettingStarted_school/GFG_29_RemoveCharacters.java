package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string/0

//8:10 AM 4/24/2018
//8:20 AM 4/24/2018

import java.util.Scanner;

public class GFG_29_RemoveCharacters {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		int tc = Integer.parseInt(sc.nextLine());

		while (tc-- > 0) {
			// enter string
			String s = sc.nextLine();

			// remove characters from the string
			// display result
			System.out.print(rmChars(s));

			if (tc > 0)
				System.out.println();
		}
	}

	static String rmChars(String s) {
		String result = "";

		// iterate each character
		for (int i = 0; i < s.length(); i++) {
			// add to string if it's not an alphabet character
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				// splash! / do nothing
			} else {
				// add char to string
				result += s.charAt(i);
			}
		}
		return result;
	}
}

/*
 * Remove all characters from an alphanumeric string.
 * 
 * Input: The first line of the input contains T denoting the number of
 * testcases. First line of each test case will be an alphanumeric string.
 * 
 * Output: For each test case output will be a numeric string after removing all
 * the characters.
 */

// Constraints:
// 1 <= T <= 30
// 1 <= size of string <= 100
//
// Example:
//
// Input:
// 1
// AA123BB4
//
// Output:
// 1234