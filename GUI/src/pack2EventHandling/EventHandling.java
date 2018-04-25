package pack2EventHandling;

import javax.swing.JFrame; //to be able to use windows

public class EventHandling{
	
	public static void main(String args[]){
		
		tuna tunaObj = new tuna();
		tunaObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits program when we with x	
		tunaObj.setSize(500,300);
		tunaObj.setVisible(true);
		
	}

}
