public class L04_mathOperators {

	public static void main(String args[]){
	
	int boys, girls, people;		//int is used for whole numbers
	double rabbit, eagles; 			//double is used for decimals	
	
	boys = 3;
	girls = 8;
	
	rabbit = 11;
	eagles = 3;
		
	people = girls + boys;	// + -> addition
	System.out.println("Addition: " + people);		
	System.out.println("Subtraction: " + (girls - boys)); // - -> subtraction
	System.out.println("Multiplication: " + girls * boys); // * -> multiplication
	System.out.println("Division: " + (girls / boys)); // / -> division
	System.out.println("Division shown in decimals: " + (rabbit/eagles));
	System.out.println("Modulus: " + (rabbit%eagles)); // % -> modulus, finding the remainder
	}
}