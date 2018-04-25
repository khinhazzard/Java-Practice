//Elements as counters
import java.util.Random;

public class counters {
	public static void main(String args[]){
		Random dice = new Random();
		int freq[] = new int[7];
		
		for(int roll=0; roll<1000; roll++){
			++freq[1+dice.nextInt(6)];
		}
		
		System.out.println("Dice#\tFrequency");
		
		for(int face=1; face<freq.length; face++){
			System.out.println(face+"\t"+freq[face]);
		}
		
	}

}