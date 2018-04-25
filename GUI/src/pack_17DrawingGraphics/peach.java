package pack_17DrawingGraphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class peach extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		
		g.setColor(Color.orange);
		//drawing a rectangle (x,y, width, height);
		g.fillRect(25,25, 100, 30);
		
		g.setColor(new Color(190,81, 250));
		g.fillRect(25,65,100, 30);
		
		g.setColor(Color.WHITE);
		g.drawString("this is some text", 25, 120);
		
		
	}
	
	

}
