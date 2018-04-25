package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/alone-in-couple/0

//2:53 PM 4/15/2018
//4:07 PM 4/15/2018
//Execution Time:0.19

import java.util.Scanner;

public class GFG_14_AloneInCouple {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		// testcase
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// array size (should be odd)
			int n = sc.nextInt();
			int arr[] = new int[n];

			// elements of array
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			// find person not in couple
			System.out.print(findSingle(arr));

			if (tc > 0)
				System.out.println();
		}
	}

	static int findSingle(int arr[]) {
		int s = arr[0];
		int checked = arr[0];

		// loop the array and compare
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				//check if array already checked	 
				 if(arr[i]==checked && i!=0){
					 break; 
				 }
				//mark couples
				 if(arr[i]==arr[j]){
					 arr[i]=checked;
					 arr[j]=checked;
					 break;
				 }
				//no couple
				 if(j==arr.length-1){
					 return arr[i];
				 }
			}
			s = arr[i];
		}
		
		//the last index has no couple
		return s;
	}
}

/*
 * Alone in couple
 * 
 * In a party everyone is in couple except one. People who are in couple have
 * same numbers. Find out the person who is not in couple.
 * 
 * Input: The first line contains an integer 'T' denoting the total number of
 * test cases. In each test cases, the first line contains an integer 'N'
 * denoting the size of array. The second line contains N space-separated
 * integers A1, A2, ..., AN denoting the elements of the array. (N is always
 * odd)
 * 
 * 
 * Output: In each seperate line print number of the person not in couple.
 */