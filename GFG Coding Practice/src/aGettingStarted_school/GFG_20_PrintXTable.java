package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/print-table/0

//4:00 PM 4/17/2018
//4:06 PM 4/17/2018
//Execution Time:0.14

import java.util.Scanner;

public class GFG_20_PrintXTable {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		
		int tc = sc.nextInt();
		
		while(tc-->0){
			//enter num
			int n = sc.nextInt();
			
			//print x table of n
			for(int i=1;i<=10;i++){
				System.out.print(n*i);
				
				if(i < 10){
					System.out.print(" ");
				}
			}
			
			if(tc>0)
				System.out.println();
		}
	}
}

/*
 * Print the table of a given number upto 10.
 * 
 * Input: First line contains an integer, the number of test cases 'T'. Each
 * test case contains a number N whose table is to be printed..
 * 
 * Output: Print the table of N upto 10.
 */