//math class methods
//built-in math functions

public class L19_mathClassMethods {

	public static void main(String args[]){
		
		Double d = 123123.34134;
		
		System.out.println(Math.abs(-21)); //absolute value
		System.out.println(Math.ceil(7.111111114)); //ceiling: always rounds up
		System.out.println(Math.floor(7.4));//floor: always rounds down
		System.out.println(Math.max(8.6, 5.2)); //maximum of numbers
		System.out.println(Math.min(8.6, 5.2)); //minimum of numbers
		System.out.println(Math.pow(5, 3)); // 5 to the third power
		System.out.println(Math.sqrt(9)); // square root of number 
		System.out.println(String.format("%.2f", d));
		
	}
}
