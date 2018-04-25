package pack_17DrawingGraphics;

import javax.swing.JFrame;

public class Apple {
	
	public static void main(String args[]){
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		peach p  = new peach();
		f.add(p);
		f.setSize(400,250);
		f.setVisible(true);
		
	}
	
}
