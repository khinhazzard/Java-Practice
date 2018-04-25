import java.util.Scanner;

//binary search
//divide and conquer
//recursive

public class BinarySearch {

	//recursion
	int bin_search(int A[], int left, int right, int k) {

		if (right >= left) {
			int mid = left + (right - left) / 2;

			// check middle
			if (A[mid] == k)
				return mid;

			// check if k is greater than mid
			if (k > A[mid])
				return bin_search(A, mid + 1, right, k);

			// check if k is lesser then mid
			if (k < A[mid])
				return bin_search(A, left, mid - 1, k);
		}

		// key not found
		return -1;
	}


	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		int size, arr[], tc, key;

		Scanner scNum = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		// Test Cases
		System.out.print("Test Cases:");
		tc = scNum.nextInt();

		// Array size
		System.out.println("Array size:");
		size = scNum.nextInt();
		arr = new int[size];

		// Series of numbers
		// must be sorted
		System.out.print("Array elements:");
		String s = scString.nextLine();
		String numbersInString[] = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(numbersInString[i]);
			System.out.println(arr[i]);
		}

		// key to be searched within the array
		System.out.print("Key:");
		key = scNum.nextInt();

		BinarySearch ob = new BinarySearch();

		int searchResult = ob.bin_search(arr, 0, arr.length, key);
		if (searchResult == -1)
			// key does not exist
			System.out.println(searchResult);
		else
			// key was found at this index
			System.out.println(searchResult);

	}
}
