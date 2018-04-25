import java.util.Random;


public class arrays {
	public static void main(String args[]){
	
		Random num = new Random();
		
		int arr[] = new int[10];
		int arr2[]={2,4,5,6,7,8,11,23}; //instant declaration
		int sum=0;
		
		for(int i =0; i<arr.length; i++){
			arr[i] = num.nextInt(100);
		}
		
		//creating array tables
		System.out.println("Array1");
		System.out.println("Index\tValue");
		
		for(int i =0; i<arr.length; i++){
			System.out.println(i+"\t"+arr[i]);
		}
		
		
		for(int i =0; i<arr2.length; i++){
			sum += arr[i];
		}
		System.out.println("Sum of the elements of Array2: "+sum);
		
	}
}
