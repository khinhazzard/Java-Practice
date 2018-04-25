package pack5_Abstract_and_Concrete;

//2 types of classes:
//abstract you can't create an object from that class but it can be used in inheritance and polymorphism etc.
//concrete can make objects from it

public class apple {
	
	
	
	public static void main(String args[]){
		
		fatty fattyObj = new fatty();
		food fObj = new tuna();
		
		fattyObj.digest(fObj);
		
		
		
	}
}
