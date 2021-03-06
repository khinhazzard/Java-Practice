package job_exam;

//6:48 PM 4/18/2018
//7:50 PM 4/18/2018

import java.util.Scanner;

public class Appstone_3_VerifyIPAddress {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		// testcases
		int tc = Integer.parseInt(sc.nextLine());

		while (tc-- > 0) {
			// enter ip address
			System.out.println("Enter IP address:");
			String s = sc.nextLine();

			// check if its a valid IP address:
			System.out.print(validate(s));

			if (tc > 0)
				System.out.println();
		}
	}

	static boolean checkNum(int num) {
		// check if number is valid
		if (num >= 0 && num <= 255) {
			return true;
		} else {
			return false;
		}
	}

	static boolean validate(String s) {
		int dots = 3;
		String num = "";

		// iterate the string
		for (int i = 0; i < s.length(); i++) {
			// find a dot
			if (s.charAt(i) == '.') {
				dots--;
				// stop if exceeds more than 3 dots
				if (dots < 0) {
					return false;
				} else {
					//validate num
					if(checkNum(Integer.parseInt(num))){
						//reset num
						num = "";
					}else{
						return false;
					}
				}
			} else {
				num += s.charAt(i);
			}
		}

		// check if number of dots still valid
		if (dots == 0) {
			//check the last digits
			return checkNum(Integer.parseInt(num));
		} else {
			return false;
		}
	}
}

/*
 * 
 * create a function that will check if an IP address is valid. A valid address
 * is composed of numbers 0 - 255 separated by three dots.
 */

// input:
// 195.255.9.0
// 255.255.0.255
// 255.191.305.0
// 191.53.0.12.4
// 120.1
// 255.123.0.500
// output:
// true
// true
// false
// false