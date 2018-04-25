package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/number-pattern/0

//10:01 AM 4/24/2018
//10:15 AM 4/24/2018

import java.util.Scanner;

public class GFG_35_NumberPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			//enter num
			int n = sc.nextInt();
			
			//print pattern n times
			for(int i = 1;i<=n;i++){
				pattern(i);
				//add spaces between
				if(i<n)
					System.out.print(" ");
			}
			
			if (tc > 0)
				System.out.println();
		}
	}
	
	static void pattern(int n){
		if(n == 1){
			System.out.print(n);
		}else{
			//increasing order
			for(int i=1;i<n;i++){
				System.out.print(i);
			}
			//decreasing order
			for(int i=n;i>=1;i--){
				System.out.print(i);
			}
		}
	}
}

/*
 * For a given number N. Print the pattern in the following form: 1 121 12321
 * 1234321 for N=4.
 * 
 * Input: First line of input contains the test cases T. Each line of test case
 * contain the value of N for which the pattern is to be displayed.
 * 
 * Output: For each value of N, print the pattern in a single line.
 */

// Example:
// Input:
// 2
// 3
// 6
//
// Output:
// 1 121 12321
// 1 121 12321 1234321 123454321 12345654321