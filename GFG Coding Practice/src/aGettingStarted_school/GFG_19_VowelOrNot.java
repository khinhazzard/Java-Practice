package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/vowel-or-not/0

//5:42 PM 4/16/2018
//5:57 PM 4/16/2018
//Execution Time:0.13

import java.util.Scanner;

public class GFG_19_VowelOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		int tc = sc.nextInt();

		// initialize vowels
		char v[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		while (tc-- > 0) {
			// enter letter
			char l = sc.next().charAt(0);

			boolean its_a_vowel = false;

			// compare letters to array using enhanced loop
			for (char c : v) {
				if (l == c) {
					its_a_vowel = true;
					break;
				}
			}

			// display if vowel or not
			if (its_a_vowel) {
				System.out.print("YES");
			} else {
				System.out.print("NO");
			}

			if (tc > 0)
				System.out.println();
		}
	}
}

/*
 * Write a program to check whether a character is vowel or not.
 * 
 * Input:
 * 
 * The first line of the input contains T denoting total number of testcases.
 * Each of the testcase contains one character c.
 * 
 * Note : c is either lowercase or uppercase english aplhabetic character
 * 
 * Output:
 * 
 * Print "YES" if character is vowel else "NO". (without the quotes)
 */