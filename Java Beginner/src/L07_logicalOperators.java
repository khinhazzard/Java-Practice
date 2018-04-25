
public class L07_logicalOperators {

	public static void main(String args[]){
		int boy, girl;
		boy = 28;
		girl = 18;
		
		// && - and operator, all conditions are true
		// || - or operator, at least 1 condition is true
		
		if(boy < 50 && girl >= 18){ 
			System.out.println("you can enter"); 
		}else{
			System.out.println("you cannot enter");
		}		
	}
}
