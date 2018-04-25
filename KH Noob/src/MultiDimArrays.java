
//Multidimensional Arrays

public class MultiDimArrays {
	public static void main(String args[]){
		int arr[][] =  {{4,5,6,7,8},
						{3,4,5,6,1}};
		int arr2[][] =  {{6,7,8},
						 {3,4,5,6,1},
						 {34}};
		System.out.println("Table 1");
		table(arr);
		System.out.println("Table 2");
		table(arr2);
	}
	

	public static void table(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[row].length;col++){
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
