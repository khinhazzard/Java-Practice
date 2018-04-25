import java.util.*;


public class genericReturnTypes {
	
	public static void main(String args[]){
		
		System.out.println(max(23,42,1));
		System.out.println(max("apples", "blackberries", "potatoes"));

	}

	//only objects that inherit form the comparable class can be used in this method
	public static <T extends Comparable<T>> T max(T a, T b, T c){//returning the type of T data
		
		T m = a; //the greatest
		
		if(b.compareTo(a) > 0)
			m = b;
		
		if(c.compareTo(m) > 0)
			m = c;
		
		return m;
	}
	
	
}
