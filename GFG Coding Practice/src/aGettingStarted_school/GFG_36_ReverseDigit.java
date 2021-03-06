package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/reverse-digit/0

//10:22 AM 4/24/2018
//11:16 AM 4/24/2018

import java.util.Scanner;

public class GFG_36_ReverseDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter digit
			int d = sc.nextInt();

			// reverse digit using recursion
			String r = reverse(d);
			
			// display
			System.out.print(Integer.parseInt(r));

			if (tc > 0)
				System.out.println();
		}
	}

	static String reverse(int n){
		String s = Integer.toString(n);
		// if it's the last digit
		if (s.length() == 1) {
			return Character.toString(s.charAt(0));
		}
		// take last digit
		char last = s.charAt(s.length() - 1);

		// take remaining digits
		String rem="";
		for (int i = 0; i < s.length()-1; i++) {
			rem += s.charAt(i);
		}
		
		// convert to int: return last digit + (recurse remaining digits)
		return last+reverse(Integer.parseInt(rem));
	}
	
	/*
	static int reverse(int n) {
		// convert n to string
		String s = Integer.toString(n);

		// if it's the last digit
		if (s.length() == 1) {
			return Character.getNumericValue(s.charAt(0));
		}

		// take last digit
		char last = s.charAt(s.length() - 1);

		// take remaining digits
		String rem="";
		for (int i = 0; i < s.length()-1; i++) {
			rem += s.charAt(i);
		}

		// convert to int: return last digit + (recurse remaining digits)
		return Integer.parseInt(last + Integer.toString(reverse(Integer.parseInt(rem))));
	}
	*/
}

/*
 * Write a program to reverse digits of a number.
 * 
 * Input:
 * 
 * The first line of input contains an integer T denoting the number of test
 * cases. The first line of each test case is N.
 * 
 * Output:
 * 
 * Print the reverse digit of a N digit number.
 */

// Example:
//
// Input:
// 2
// 200
// 122
//
// Output:
// 2
// 221