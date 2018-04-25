
public class L05_incrementOperators {
	public static void main(String args[]){
	int tuna = 5;
	int bass = 18;

	System.out.println(++tuna);		//already incremented
	System.out.println(tuna++);		//displayed before increment
	System.out.println(tuna);
	
	bass = bass + 2;
	System.out.println(bass);
	
	bass += 2; 						//alternative way of: bass = bass + 2;
	System.out.println(bass);
	System.out.println(bass-=2);	//can also be done with other operators
	System.out.println(bass*=2);
	System.out.println(bass/=2);
	System.out.println(bass%=3);
	}	
}
