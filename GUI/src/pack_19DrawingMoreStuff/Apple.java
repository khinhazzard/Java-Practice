package pack_19DrawingMoreStuff;

import java.awt.*;
import javax.swing.*;

public class Apple {
	
	public static void main(String args[]){
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		peach p = new peach();
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(500, 300);
		f.setVisible(true);
		
	}

}
