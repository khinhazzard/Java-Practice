package KH_conversions;

public class StringToLong {

	public static void main(String args[]){
		
		String numberAsString = "1234";
		long number = Long.parseLong(numberAsString);
		System.out.println("The number is: " + number);
	}
}
