import java.util.*;

public class genericMethod {
	
	public static void main(String[]args){
		
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'k','h','i','n'};
		
		printMe(iray);
		printMe(cray);
		
	}
	/*
	//overload methods
	
	private static void printMe(Integer[] i){
		
		for(Integer x: i)
			System.out.printf("%s ", x);
		
	}
	
	private static void printMe(Character[] c){
		
		for(Character x: c)
			System.out.printf("%s ", x);
		
	}
	*/
	
	
	//generic method
	private static <T> void printMe(T[] x){
		
		for(T i: x)
			System.out.printf("%s ", i);
		System.out.println();
	}
	
}
