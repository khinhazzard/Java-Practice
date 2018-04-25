package aGettingStarted_school;

//Remove repeated digits in a given number
//https://practice.geeksforgeeks.org/problems/remove-repeated-digits-in-a-given-number/0

//started at 3:57 PM 4/12/2018
//finised at 5:11 PM 4/12/2018

import java.util.Scanner;

public class GFG_7_RemoveRepeatedDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// testcases
		System.out.println("Input:");
		int tc = sc.nextInt();

		while (tc-- > 0) {

			//enter a number
			long n = sc.nextLong();
			
			//convert to string
			String s = new Long(n).toString();
			
			//store to char array
			char c_arr[] = s.toCharArray();
			
			//initialize			
			char current = c_arr[0];
			String cleaned = Character.toString(current);
			
			//remove consecutive digits
			for(int i =1;i<c_arr.length;i++){
				//comparing two consecutive numbers
				if(current != c_arr[i]){
					cleaned += Character.toString(c_arr[i]);
					current = c_arr[i];
				}
			}
			
			//display it in integers
			System.out.print(Long.parseLong(cleaned));
			
			if (tc > 0) {
				System.out.println();
			}
		}
	}
}

/*
 * 
 * Given an integer N, remove consecutive repeated digits from it.
 * 
 * Input:
 * 
 * The first line of input contains an integer T denoting the number of test
 * cases. Then T test cases follow. The first line of each test case contains
 * the integer N.
 * 
 * Output:
 * 
 * Print the number after removing consecutive digits. Print the answer for each
 * test case in a new line.
 */