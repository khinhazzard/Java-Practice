public class L22_ArraysInMethods {
	public static void main(String args[]){
		int arr[] = {2,3,4,5,6,7};

		change(arr);

		for(int y:arr){
			System.out.println(y);
		}
	}
	
	public static void change(int x[]){
		for(int i=0;i<x.length;i++)
			x[i]+=5; //changes values inside array by adding 5 to each index
	}
}
