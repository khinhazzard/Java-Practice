package pack2_polymorphic_arguments;

public class apple {
	
	public static void main(String args[]){
	
		fatty boy = new fatty("");
		
		//food fud = new food();
		food fud2 = new pizza();
		food fud3 = new tuna();
		
		//boy.digest(fud);
		boy.digest(fud2);
		boy.digest(fud3);
	
	}	
}
