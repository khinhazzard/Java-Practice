

import java.util.Scanner;

public class sample01_Calculate {
	public static void main(String args[]){
		Double fnum, snum, sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		fnum = scan.nextDouble();
		System.out.print("Enter 2nd number: ");
		snum = scan.nextDouble();
		sum = fnum + snum;
		System.out.printf("Sum = %.2f", sum);
	}
}
