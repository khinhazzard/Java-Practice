package aGettingStarted_school;

//lesson -> https://www.geeksforgeeks.org/binary-search/
//https:practice.geeksforgeeks.org/problems/binary-search/1/?ref=self
//1:53 PM 4/10/2018
//3:51 PM 4/10/2018

import java.util.Scanner;

public class GFG_3_binarySearch {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int tc;

		// test case
		System.out.println("Input");
		tc = sc.nextInt();

		while (tc-- > 0) {
			// array size
			int n = sc.nextInt();
			int arr[] = new int[n];

			// fill the array, input numbers in ascending order or sorted
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// key number to be searched
			int k = sc.nextInt();

			// return the index of the number searched
			System.out.print(bin_search(arr, 0, arr.length - 1, k));

			// add new line between inputs
			if (tc > 0)
				System.out.println();
		}
	}

	// recursive
	// function in searching for k in the array
	static int bin_search(int arr[], int left, int right, int key) {
		
		//check if this is the last index
		if(right>=left){
			// middle pointer
			int mid = left + ((right - left) / 2);
			
			// check if m = key
			if (arr[mid] == key) {
				return mid;// returns the index of the value found
			}
			// take 1st half or array if mid > key
			if (arr[mid] > key) {
				return bin_search(arr, left, mid - 1, key);
			}
			// take 2nd half array if mid < key
			if (arr[mid] < key) {
				return bin_search(arr, mid + 1, right, key);
			}
		}	
			// number does not exist inside the array
			return -1;
	}
}

/*
 * Given a sorted array A[] ( 0 based index ) and a key "k" you need to complete
 * the function bin_search to determine the position of the key if the key is
 * present in the array. If the key is not present then you have to return -1.
 * The arguments left and right denotes the left most index and right most index
 * of the array A[] . There are multiple test cases. For each test case, this
 * function will be called individually.
 * 
 * Example
 * 
 * Input: The first line contains an integer 'T' denoting the number of test
 * cases. Then 'T' test cases follow. Each test case consists of 3 lines. First
 * line of each test case contains an integer N denoting the size of the array .
 * Second line of each test case consists of 'N' space separated integers
 * denoting the elements of the array A[]. The third line contains a key 'k' .
 * 
 * Output: Prints the position of the key if its present in the array else print
 * -1 if the key is not present in the array.
 */