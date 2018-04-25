package pack2_polymorphic_arguments;

public class fatty { //concrete classe
	
	private String name;

	public fatty(){
		this(""); //calls method public fatty(String name)
	}
	
	public fatty(String name){
		setName(name);
	}
	
	private void setName(String name){
		this.name = ((name == "") ? "unknownfatty":"fatty"+name);
	}

	public String toString(){
		return String.format("%s eats food and says: ", name);
	}
	
	public void display(){
		System.out.print(toString());
	}
	
	public void digest(food x){
		
		display();
		x.eat();
		
	}
	
}
