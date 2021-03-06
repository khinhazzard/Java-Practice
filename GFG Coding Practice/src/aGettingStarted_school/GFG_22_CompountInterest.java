package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/compound-interest/0

//4:22 PM 4/17/2018
//4:55 PM 4/17/2018
//Execution Time:0.15

import java.util.Scanner;

public class GFG_22_CompountInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		int tc = sc.nextInt();
		
		while(tc-->0){
			//principal amount, time(years),compound n times in a year
			int p_amount = sc.nextInt();
			int t = sc.nextInt();
			int n = sc.nextInt();
			//rate
			double rate = sc.nextInt()*.01;
			
			//compute future value
			double amount = p_amount*(Math.pow(1 + (rate / n), n*t));
			
			//display in floor value, converted to int(to remove decimals)
			System.out.print((int)Math.floor(amount));
			
			if(tc>0)
				System.out.println();
		}
	}
}

// compound interest formula:
// A= P(1 + r / n)^nt
// where:
// A - amount. p - principal, r - interest rate, t - time(years)
// n - number of times interest is compounded per year

/*
 * Write a program to find the compund interest for given principal amount P ,
 * time T(in years), compounds N times in a year at rate R. Calculate floor of
 * future value of given principal amount.
 * 
 * Input: First line contains an integer, the number of test cases 'T'. Each
 * test case should contain three values P, T, N, R.
 * 
 * Output: Print the future value for given principal after calculating Compund
 * Interest. Note: Print only floor of the future value. For example, if future
 * value is 134.891, then output should be 134.
 */
