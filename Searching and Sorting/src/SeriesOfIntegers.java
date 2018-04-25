import java.util.Scanner;

//storing series of integers(separated only by space) in an array

public class SeriesOfIntegers {

	public static void main(String[] args){
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a series of integers:");
		String s = sc.nextLine();
		String numbersInString[] = s.split(" ");

		int arr[] = new int[numbersInString.length];
		for (int i = 0; i < numbersInString.length; i++) {
			arr[i] = Integer.parseInt(numbersInString[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Arr[%d] = %d\n", i,arr[i]);
		}
		
	}
}
