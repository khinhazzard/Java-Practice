//enhanced loop in java when dealing with arrays only

public class enhancedLoop {
	public static void main(String args[]){
		int arr[] = {3,4,5,6,7};
		int totalsum = 0;
		
		
		for(int x:arr){ //values of array are stored to x
			totalsum += x;
		}
		
		System.out.println("Total Sum = " +totalsum);
	}
}
