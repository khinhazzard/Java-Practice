package pack1_polymorphism;

public class apple {
	
	public static void main(String args[]){
		
		//tuna tunaObj = new tuna();
		//food tunaObj = new tuna();
		
		food tunaObj[] = new food[2];
		tunaObj[0]= new tuna();  //polymorphic array
		tunaObj[1]= new pizza();
		
		for(int x=0; x<tunaObj.length; x++){
			tunaObj[x].eat();
		}
				
	}

}
