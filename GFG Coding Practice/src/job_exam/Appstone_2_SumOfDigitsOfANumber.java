package job_exam;

//hard
//8:00 PM 4/18/2018
//10:04 PM 4/18/2018
import java.util.Scanner;

public class Appstone_2_SumOfDigitsOfANumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// accept integer
			int n = sc.nextInt();
			// convert to string so we can store digit individually
			String s = Integer.toString(n);
			int nums[] = new int[s.length()];

			// store each digit in an array
			for (int i = 0; i < s.length(); i++) {
				nums[i] = Character.getNumericValue(s.charAt(i));
			}

			// display
			//System.out.print(sum(0, nums, 0));
			System.out.print(sum_of_digits(n));
			
			if (tc > 0)
				System.out.println();
		}
	}

	//other solution
	static int sum(int total_sum, int nums[], int p) {
		if (p < nums.length - 1) {
			// increment total sum
			total_sum += nums[p];
			p++;
			return sum(total_sum, nums, p);
		} else {// stop after the length of the array
			total_sum += nums[p];
			return total_sum;
		}
	}

	//correct solution
	static int sum_of_digits(int n) {
		// convert integer to string so we can break them down
		String digits = Integer.toString(n);

		// check if this is the last digit
		if (digits.length() == 1) {
			return Integer.parseInt(digits);
		} else {
			// take the 1st digit
			int d = Character.getNumericValue(digits.charAt(0));
			// take remaining digits
			String r_digits = "";
			for (int i = 1; i < digits.length(); i++) {
				r_digits += digits.charAt(i);
			}
			//add taken digit to sum_of_digits(recursion)
			return d + sum_of_digits(Integer.parseInt(r_digits));
		}
	}
}

/*
 * create a function that accepts only an integer function(int n) returns the
 * sum of digits of that number using recursion.
 */

// input:
// 2019
// 9855
// Output:
// 12 (since 2+0+1+9 = 12)
// 27 (since 9+8+5+5 = 27)
