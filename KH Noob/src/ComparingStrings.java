
public class ComparingStrings {
	
	public static void main(String args[]){
		
		String a = "apple";
		String b = "teresita";
		String c = "TERESITA";
		
		if(a.equals("apple")){
			System.out.println("a is equal to apple");
		}
		
		if(b.equals(c)){
			System.out.println("b equals c");
		}
		
		
		//ignores caps
		if(b.equalsIgnoreCase(c)){
			System.out.printf("%s equals %s", b,c);
		}
		
	}

}
