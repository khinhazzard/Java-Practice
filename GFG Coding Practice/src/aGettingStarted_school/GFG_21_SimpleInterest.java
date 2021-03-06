package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/simple-interest/0/?ref=self
//4:07 PM 4/17/2018
//4:21 PM 4/17/2018
//Execution Time:0.13
import java.util.Scanner;

public class GFG_21_SimpleInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter principal amount, time(years), rate
			int p_amount = sc.nextInt();
			int years = sc.nextInt();
			int rate = sc.nextInt();

			// compute simple interest, rounded down
			double si = Math.floor((p_amount * (rate * 0.01)) * years);

			// convert to int and print
			System.out.print((int) (si));

			if (tc > 0)
				System.out.println();
		}
	}
}

/*
 * Write a program to find the simple interest for given principal amount P,
 * time T(in years) and rate R.
 * 
 * Input: First line contains an integer, the number of test cases 'T'. Each
 * test case should contain three values P,T,R.
 * 
 * Output: Print the simple interest
 */

// Example:
//
// Input:
// 2
// 42
// 8
// 15
// 501
// 10
// 5
//
// Output:
// 50
// 250