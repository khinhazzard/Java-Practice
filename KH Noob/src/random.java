//random number generator
import java.util.Random;

public class random {
	public static void main(String args[]){
		Random dice = new Random();
		int number;
		int gen[] = new int[6];
//		basic random number generator
//		for(int i=1; i<10; i++)
//		{
//			number = 1+dice.nextInt(6); // 6 options 1-6, eliminates 0 by +1
//			System.out.println( number + " ");
//		}
		
		//randomization with no repetition
		int limit = 6, fequal=0, i =0;
		while(i < limit ){
			fequal = 0;
			number = 1+dice.nextInt(6); // 6 options 1-6, eliminates 0 by +1
			for(int a : gen){
				if(number == a){
					//equall
					fequal = 1;
				}
			}
			
			if(fequal == 1){
				//number = 1+dice.nextInt(6);
			}
			else{
				System.out.println( number + " ");
				gen[i] = number;
				i++;
			}
		}
	}
}
