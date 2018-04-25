package KH_conversions;

public class CharToInt {
	public static void main(String args[]) {
		char c = '5';
		
		int n = Character.getNumericValue(c);

		System.out.println(n);
	}
}
