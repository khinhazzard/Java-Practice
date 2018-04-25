//compound interest program
//this program shows an example on how to calculate interest

public class sample03_compoundInterest {
	public static void main(String args[]){
		double	principal = 10000,
				rate = 0.01, 
				amount;
		
		for(int day = 1; day<=20; day++)
		{
			amount = principal*Math.pow(1+rate, day);
			System.out.println("day " +day +"  "  +amount);
			
		}
	
	}
}
